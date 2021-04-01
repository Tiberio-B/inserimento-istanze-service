package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.decSvincoloReintroito;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneDecSvincoloReintroitoMapper extends CostituzioneDepositoMapper<CostituzioneDecSvincoloReintroitoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDecSvincoloReintroitoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}
