package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.RtsDto;
import it.sogei.svildep.istanzaservice.model.Rts;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RtsMapper implements Mapper<Rts, RtsDto> {

    @Override
    public RtsDto convertEntityToDtoImpl(Rts entity) {
        return new RtsDto();
    }

    @Override
    public Rts convertDtoToEntityImpl(RtsDto dto) {
        return new Rts();
    }
}
