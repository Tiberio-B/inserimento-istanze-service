package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.RTS;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.soggetto.CoinvolgimentoSoggettoMapper;
import it.sogei.svildep.istanzaservice.repository.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDepositoService<D extends CostituzioneDepositoDto> {

    @Autowired private CostituzioneDepositoMapper<D> istanzaMapper;
    @Autowired private CoinvolgimentoSoggettoMapper coinvolgimentoSoggettoMapper;
    @Autowired private StatoIstanzaRepository statoIstanzaRepository;
    @Autowired private IstanzaRepository istanzaRepository;
    @Autowired private CoinvolgimentoSoggettoRepository coinvolgimentiRepository;
    @Autowired private SoggettoRepository soggettoRepository;
    @Autowired private FascicoloRepository fascicoloRepository;

    @Transactional
    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = istanzaMapper.mapDtoToEntity(istanzaDtoInserimento);
        setStato(istanza);
        istanzaRepository.saveAndFlush(istanza);
        associazioneAiSoggetti(istanza, istanzaDtoInserimento.getCoinvolgimenti());
        inserimentoInFascioloRts(istanza.getRtsCompetente(), istanzaDtoInserimento.getAllegati());
        return new MessageDto(Messages.inserimento, HttpStatus.OK);
    }

    private void setStato(Istanza istanza) {
        boolean inserimentoManuale = istanza.getInserimentoManuale().equals(FlagSN.S);
        Optional<StatoIstanza> statoIstanza = statoIstanzaRepository.findByCodice(inserimentoManuale? FlagStatoIstanza.SIB : FlagStatoIstanza.SII);
        istanza.setStato(statoIstanza.orElse(null));
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
