package it.sogei.svildep.istanzaservice.mapper.geo;

import it.sogei.svildep.istanzaservice.dto.geo.StatoEsteroDto;
import org.springframework.stereotype.Component;

@Component
public class NazioneMapper implements Mapper<Nazione, StatoEsteroDto> {

    @Override
    public StatoEsteroDto mapEntityToDtoImpl(Nazione entity) {
        StatoEsteroDto dto = new StatoEsteroDto();
        dto.setNome(entity.getNome());
        dto.setAreaSepa(entity.getAreaSepa().toString());
        return dto;
    }

    @Override
    public Nazione mapDtoToEntityImpl(StatoEsteroDto dto) {
        Nazione entity = new Nazione();
        entity.setNome(dto.getNome());

        String areaSepa = dto.getAreaSepa();
        entity.setAreaSepa(areaSepa != null? Boolean.parseBoolean(areaSepa) : null);
        return entity;
    }
}
