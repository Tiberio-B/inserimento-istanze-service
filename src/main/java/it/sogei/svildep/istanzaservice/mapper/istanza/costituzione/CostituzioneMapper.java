package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneMapper extends CostituzioneDepositoMapper<CostituzioneDepositoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDepositoDto dto) throws RuntimeException {
        return super.mapDtoToEntityImpl(dto);
    }
}
