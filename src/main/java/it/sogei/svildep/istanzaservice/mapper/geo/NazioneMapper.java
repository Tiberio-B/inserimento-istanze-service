package it.sogei.svildep.istanzaservice.mapper.geo;

import it.sogei.svildep.istanzaservice.dto.geo.NazioneDto;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.geo.Nazione;
import org.springframework.stereotype.Component;

@Component
public class NazioneMapper implements Mapper<Nazione, NazioneDto> {

    @Override
    public NazioneDto mapEntityToDtoImpl(Nazione entity) {
        NazioneDto dto = new NazioneDto();
        dto.setNome(entity.getNome());
        dto.setAreaSepa(entity.getAreaSepa().toString());
        return dto;
    }

    @Override
    public Nazione mapDtoToEntityImpl(NazioneDto dto) {
        Nazione entity = new Nazione();
        entity.setNome(dto.getNome());

        String areaSepa = dto.getAreaSepa();
        entity.setAreaSepa(areaSepa != null? Boolean.parseBoolean(areaSepa) : null);
        return entity;
    }
}
