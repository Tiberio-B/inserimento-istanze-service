package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.ProtocolloDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Protocollo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProtocolloMapper implements Mapper<Protocollo, ProtocolloDto> {

    @Override
    public ProtocolloDto mapEntityToDtoImpl(Protocollo entity) {
        ProtocolloDto dto = new ProtocolloDto();
        dto.setNumero(String.valueOf(entity.getNumero()));
        dto.setData(entity.getData().toString());
        return dto;
    }

    @Override
    public Protocollo mapDtoToEntityImpl(ProtocolloDto dto) throws RuntimeException {
        Protocollo entity = new Protocollo();
        entity.setNumero(Long.parseLong(dto.getNumero()));
        entity.setData(LocalDateTime.parse(dto.getData()));
        return entity;
    }
}
