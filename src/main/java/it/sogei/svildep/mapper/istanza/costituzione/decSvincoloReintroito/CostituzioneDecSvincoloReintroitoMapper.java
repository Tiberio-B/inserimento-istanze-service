package it.sogei.svildep.mapper.istanza.costituzione.decSvincoloReintroito;

import it.sogei.svildep.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneDecSvincoloReintroitoMapper extends CostituzioneDepositoMapper<CostituzioneDecSvincoloReintroitoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDecSvincoloReintroitoDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}
