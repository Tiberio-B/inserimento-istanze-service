package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.RichiestaDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RichiestaMapper implements Mapper<Richiesta, RichiestaDto> {

    @Override
    public RichiestaDto mapEntityToDtoImpl(Richiesta entity) {
        RichiestaDto dto = new RichiestaDto();
        dto.setData(entity.getData().toString());
        return dto;
    }

    @Override
    public Richiesta mapDtoToEntityImpl(RichiestaDto dto) throws RuntimeException {
        Richiesta entity = new Richiesta();
        entity.setData(LocalDateTime.parse(dto.getData()));
        return entity;
    }
}
