package it.sogei.svildep.istanzaservice.service.costituzione;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.soggetto.CoinvolgimentoSoggettoMapper;
import it.sogei.svildep.istanzaservice.repository.CoinvolgimentoSoggettoRepository;
import it.sogei.svildep.istanzaservice.repository.IstanzaRepository;
import it.sogei.svildep.istanzaservice.repository.SoggettoRepository;
import it.sogei.svildep.istanzaservice.repository.StatoIstanzaRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    @Transactional
    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = istanzaMapper.mapDtoToEntity(istanzaDtoInserimento);
        setStato(istanza);
        istanzaRepository.saveAndFlush(istanza);
        associazioneAiSoggetti(istanzaDtoInserimento, istanza);
        return new MessageDto(Messages.inserimento, HttpStatus.OK);
    }

    private void setStato(Istanza istanza) {
        boolean inserimentoManuale = istanza.getInserimentoManuale().equals(FlagSN.S);
        Optional<StatoIstanza> statoIstanza = statoIstanzaRepository.findByCodice(inserimentoManuale? FlagStatoIstanza.SIB : FlagStatoIstanza.SII);
        istanza.setStato(statoIstanza.orElse(null));
    }

    private void associazioneAiSoggetti(D istanzaDtoInserimento, Istanza istanza) throws SvildepException {
        coinvolgimentoSoggettoMapper.mapDtoToEntity(istanzaDtoInserimento.getCoinvolgimenti()).forEach(coinvolgimentoSoggetto -> {
            if (soggettoRepository.findById(coinvolgimentoSoggetto.getSoggetto().getId()).isEmpty()) {
                throw new SvildepException(Messages.soggettoNonPresente);
            }
            coinvolgimentoSoggetto.setIstanza(istanza);
            coinvolgimentiRepository.save(coinvolgimentoSoggetto);
        });
    }

}
