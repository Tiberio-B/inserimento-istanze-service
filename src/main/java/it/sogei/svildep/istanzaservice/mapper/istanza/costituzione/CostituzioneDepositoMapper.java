package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Getter
@NoArgsConstructor
public class CostituzioneDepositoMapper<D extends CostituzioneDepositoDto> implements DtoToEntityMapper<Istanza, D> {

    @Autowired private IstanzaMapper istanzaMapper;

    @Override
    public Istanza mapDtoToEntityImpl(D dto) throws RuntimeException {
        return istanzaMapper.mapDtoToEntityImpl(dto);
    }
}
