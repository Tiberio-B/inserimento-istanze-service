package it.sogei.svildep.istanzaservice.service.costituzione;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.soggetto.CoinvolgimentoSoggettoMapper;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class CostituzioneDepositoService<D extends CostituzioneDepositoDto> extends IstanzaService {

    @Autowired
    private CostituzioneDepositoMapper<D> istanzaMapper;
    @Autowired
    private CoinvolgimentoSoggettoMapper coinvolgimentoSoggettoMapper;

    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza istanza = istanzaMapper.mapDtoToEntity(istanzaDtoInserimento);
        List<CoinvolgimentoSoggetto> coinvolgimenti = coinvolgimentoSoggettoMapper.mapDtoToEntity(istanzaDtoInserimento.getCoinvolgimenti());
        return getPersistenceService().insertIstanza(istanza, coinvolgimenti);
    }


}
