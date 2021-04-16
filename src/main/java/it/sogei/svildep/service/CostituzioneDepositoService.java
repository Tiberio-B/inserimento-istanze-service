package it.sogei.svildep.service;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.dto.soggetto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.entity.gestionerts.CompetenzaRts;
import it.sogei.svildep.entity.gestionerts.Rts;
import it.sogei.svildep.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.entity.gestionesoggetti.Provincia;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.mapper.soggetto.CoinvolgimentoSoggettoMapper;
import it.sogei.svildep.repository.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Getter
@NoArgsConstructor
public class CostituzioneDepositoService<D extends CostituzioneDepositoDto> {

    @Autowired private CostituzioneDepositoMapper<D> istanzaMapper;
    @Autowired private CoinvolgimentoSoggettoMapper coinvolgimentoSoggettoMapper;

    @Autowired private IstanzaRepository istanzaRepository;
    @Autowired private StatoIstanzaRepository statoIstanzaRepository;

    @Autowired private CoinvolgimentoSoggettoRepository coinvolgimentiRepository;
    @Autowired private SoggettoRepository soggettoRepository;
    @Autowired private FascicoloRepository fascicoloRepository;
    @Autowired private RtsRepository rtsRepository;
    @Autowired private CompetenzaRtsRepository competenzaRtsRepository;
    @Autowired private IndirizzoRepository indirizzoRepository;

    @Transactional
    public MessageDto insert(D costituzioneDepositoDto) throws SvildepException {
        Istanza istanza = inizioInserimentoIstanza(costituzioneDepositoDto);
        return fineInserimentoIstanza(istanza, costituzioneDepositoDto);
    }

    Istanza inizioInserimentoIstanza(D istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = istanzaMapper.mapDtoToEntity(istanzaDtoInserimento);
        StatoIstanza statoIstanza = statoIstanzaRepository.findByCodice(
                istanzaDtoInserimento.isInserimentoManuale()? FlagStatoIstanza.SIB : FlagStatoIstanza.SII)
                .orElseThrow(() -> new SvildepException(Messages.erroreStatoIstanza));
        istanza.setStato(statoIstanza);
        return istanza;
    }

    MessageDto fineInserimentoIstanza(Istanza istanza, D costituzioneDepositoDto) throws SvildepException {
        return fineInserimentoIstanza(istanza, costituzioneDepositoDto,
                calcolaProvinciaCompetente(Long.parseLong(costituzioneDepositoDto.getSoggettoRtsCompetenteId())));
    }

    MessageDto fineInserimentoIstanza(Istanza istanza, D costituzioneDepositoDto, Provincia provinciaCompetente) throws SvildepException {
        CompetenzaRts competenzaRts = competenzaRtsRepository.findByProvincia(provinciaCompetente)
                .orElseThrow(() -> new SvildepException("TO-DO ERROR"));
        istanza.setRtsCompetente(competenzaRts.getRts());
        istanzaRepository.saveAndFlush(istanza);
        associazioneAiSoggetti(istanza, costituzioneDepositoDto.getCoinvolgimenti());
//        inserimentoInFascioloRts(istanza.getRtsCompetente(), costituzioneDepositoDto.getAllegati());
        return new MessageDto(Messages.inserimento, HttpStatus.OK);
    }

    private Provincia calcolaProvinciaCompetente(Long idPerCalcoloRtsCompetente) throws SvildepException {
        CoinvolgimentoSoggetto coinvolgimento = coinvolgimentiRepository.findById(idPerCalcoloRtsCompetente)
                .orElseThrow(() -> new SvildepException("TO-DO ERROR"));
        Indirizzo indirizzoSoggetto = indirizzoRepository.findBySoggetto(coinvolgimento.getSoggetto())
                .orElseThrow(() -> new SvildepException("TO-DO ERROR"));
        return indirizzoSoggetto.getComune().getProvincia();
    }

    private void associazioneAiSoggetti(Istanza istanza, List<CoinvolgimentoSoggettoDto> coinvolgimenti) throws SvildepException {
        coinvolgimentoSoggettoMapper.mapDtoToEntity(coinvolgimenti).forEach(coinvolgimento -> {
            if (soggettoRepository.findById(coinvolgimento.getSoggetto().getId()).isEmpty())
                throw new SvildepException(Messages.soggettoNonPresente);
            coinvolgimento.setIstanza(istanza);
            coinvolgimentiRepository.save(coinvolgimento);
        });
    }

    private void inserimentoInFascioloRts(Rts rts, List<byte[]> allegati) {
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
