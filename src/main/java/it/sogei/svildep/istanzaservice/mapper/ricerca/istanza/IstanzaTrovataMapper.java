package it.sogei.svildep.istanzaservice.mapper.ricerca.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.istanzaservice.mapper.EntityToDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaTrovataMapper implements EntityToDtoMapper<Istanza, IstanzaTrovataDto> {

    private final IstanzaMapper istanzaMapper;

    @Override
    public IstanzaTrovataDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaTrovataDto dto = (IstanzaTrovataDto) istanzaMapper.mapEntityToDtoImpl(entity);
        return dto;
    }
}
