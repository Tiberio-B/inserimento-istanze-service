package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.geo.StatoEsteroDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.StatoEstero;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class StatoEsteroMapper implements Mapper<StatoEstero, StatoEsteroDto> {

    @Override
    public StatoEsteroDto mapEntityToDtoImpl(StatoEstero entity) {
        StatoEsteroDto dto = new StatoEsteroDto();
        dto.setNome(entity.getNome());
        dto.setAreaSepa(entity.getAreaSepa().toString());
        return dto;
    }

    @Override
    public StatoEstero mapDtoToEntityImpl(StatoEsteroDto dto) {
        StatoEstero entity = new StatoEstero();
        entity.setNome(dto.getNome());

        String areaSepa = dto.getAreaSepa();
        entity.setAreaSepa(areaSepa != null? Boolean.parseBoolean(areaSepa) : null);
        return entity;
    }
}
