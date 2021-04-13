package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestionerts.RTS;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.soggetto.CoinvolgimentoSoggettoMapper;
import it.sogei.svildep.istanzaservice.repository.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Getter
@NoArgsConstructor
public class CostituzioneDepositoService<D extends CostituzioneDepositoDto> {

    @Autowired private CostituzioneDepositoMapper<D> istanzaMapper;
    @Autowired private CoinvolgimentoSoggettoMapper coinvolgimentoSoggettoMapper;
    @Autowired private StatoIstanzaRepository statoIstanzaRepository;
    @Autowired private IstanzaRepository istanzaRepository;
    @Autowired private CoinvolgimentoSoggettoRepository coinvolgimentiRepository;
    @Autowired private SoggettoRepository soggettoRepository;
    @Autowired private FascicoloRepository fascicoloRepository;
    @Autowired private RtsRepository rtsRepository;
    @Autowired private CompetenzaRtsRepository competenzaRtsRepository;
    @Autowired private IndirizzoRepository indirizzoRepository;

    @Transactional
    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = prepareInsert(istanzaDtoInserimento, FlagTipoCoinvolgimento.CSR);
        return persist(istanza, istanzaDtoInserimento);
    }

    Istanza prepareInsert(D istanzaDtoInserimento) {
        return prepareInsert(istanzaDtoInserimento, FlagTipoCoinvolgimento.CSR);
    }

    Istanza prepareInsert(D istanzaDtoInserimento, FlagTipoCoinvolgimento codiceCoinvolgimento) {
        Istanza istanza = istanzaMapper.mapDtoToEntity(istanzaDtoInserimento);
        istanza.setStato(findStato(istanzaDtoInserimento));
        istanza.setRtsCompetente(findRtsCompetente(istanza, codiceCoinvolgimento));
        return istanza;
    }

    MessageDto persist(Istanza istanza, D istanzaDtoInserimento) {
        istanzaRepository.saveAndFlush(istanza);
        associazioneAiSoggetti(istanza, istanzaDtoInserimento.getCoinvolgimenti());
        // inserimentoInFascioloRts(istanza.getRtsCompetente(), istanzaDtoInserimento.getAllegati());
        return new MessageDto(Messages.inserimento, HttpStatus.OK);
    }

    private StatoIstanza findStato(D istanzaDtoInserimento) {
        boolean inserimentoManuale = istanzaDtoInserimento.getInserimentoManuale().equals(FlagSN.S);
        Optional<StatoIstanza> statoIstanza = statoIstanzaRepository.findByCodice(inserimentoManuale? FlagStatoIstanza.SIB : FlagStatoIstanza.SII);
        return statoIstanza.orElse(null);
    }

    private RTS findRtsCompetente(Istanza istanza, FlagTipoCoinvolgimento codiceCoinvolgimento) {
        AtomicReference<RTS> rts = new AtomicReference<>();
        coinvolgimentiRepository.findByCodiceAndIstanza(codiceCoinvolgimento, istanza).ifPresent(proprietario -> {
            indirizzoRepository.findBySoggetto(proprietario.getSoggetto()).ifPresent(soggetto -> {
                competenzaRtsRepository.findByProvincia(soggetto.getComune().getProvincia()).ifPresent(competenzaRts -> {
                    rts.set(competenzaRts.getRts());
                });
            });
        });
        return rts.get();
    }

    private void associazioneAiSoggetti(Istanza istanza, List<CoinvolgimentoSoggettoDto> coinvolgimenti) throws SvildepException {
        coinvolgimentoSoggettoMapper.mapDtoToEntity(coinvolgimenti).forEach(coinvolgimento -> {
            if (soggettoRepository.findById(coinvolgimento.getSoggetto().getId()).isEmpty()) {
                throw new SvildepException(Messages.soggettoNonPresente);
            }
            coinvolgimento.setIstanza(istanza);
            coinvolgimentiRepository.save(coinvolgimento);
        });
    }

    private void inserimentoInFascioloRts(RTS rts, List<byte[]> allegati) {
        if (allegati != null) {
            allegati.forEach(allegato -> {
                Fascicolo fascicolo = new Fascicolo();
                fascicolo.setRts(rts);
                fascicolo.setDocumentoAllegato(allegato);
                fascicoloRepository.save(fascicolo);
            });
        }
    }

}
