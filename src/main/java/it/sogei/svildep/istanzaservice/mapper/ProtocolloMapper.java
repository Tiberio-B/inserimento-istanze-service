package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.ProtocolloDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Protocollo;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProtocolloMapper implements Mapper<Protocollo, ProtocolloDto> {

    @Override
    public ProtocolloDto convertEntityToDtoImpl(Protocollo entity) {
        ProtocolloDto dto = new ProtocolloDto();
        dto.setNumero(String.valueOf(entity.getNumero()));
        dto.setData(entity.getData().toString());
        return dto;
    }

    @Override
    public Protocollo convertDtoToEntityImpl(ProtocolloDto dto) throws SvildepException {
        Protocollo entity = new Protocollo();
        try {
            if (dto.getNumero() != null) entity.setNumero(Long.parseLong(dto.getNumero()));
            entity.setData(LocalDateTime.parse(dto.getData()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getCause() + " " + ex.getMessage());
        }
        return entity;
    }
}
