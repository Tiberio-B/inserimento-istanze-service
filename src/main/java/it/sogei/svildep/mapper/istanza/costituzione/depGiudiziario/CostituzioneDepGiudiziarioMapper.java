package it.sogei.svildep.mapper.istanza.costituzione.depGiudiziario;

import it.sogei.svildep.dto.istanza.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneDepGiudiziarioMapper extends CostituzioneDepositoMapper<CostituzioneDepGiudiziarioDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDepGiudiziarioDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}
