package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import org.springframework.stereotype.Component;

@Component
public class DocumentoMapper implements Mapper<Documento, DocumentoDto> {

    @Override
    public DocumentoDto mapEntityToDtoImpl(Documento entity) {
        return new DocumentoDto();
    }

    @Override
    public Documento mapDtoToEntityImpl(DocumentoDto dto) {
        return new Documento();
    }
}
