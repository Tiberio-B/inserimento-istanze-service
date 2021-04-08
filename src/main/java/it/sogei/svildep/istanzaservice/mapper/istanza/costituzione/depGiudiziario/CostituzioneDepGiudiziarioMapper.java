package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depGiudiziario;

import it.sogei.svildep.istanzaservice.dto.istanza.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import org.springframework.stereotype.Component;

@Component
public class CostituzioneDepGiudiziarioMapper extends CostituzioneDepositoMapper<CostituzioneDepGiudiziarioDto> {

    @Override
    public Istanza mapDtoToEntityImpl(CostituzioneDepGiudiziarioDto dto) throws RuntimeException {
        return getIstanzaMapper().mapDtoToEntityImpl(dto);
    }
}
