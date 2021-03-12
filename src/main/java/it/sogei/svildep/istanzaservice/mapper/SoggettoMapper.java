package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoggettoMapper implements Mapper<Soggetto, SoggettoDto> {

    private final DocumentoMapper documentoMapper;

    public SoggettoMapper(DocumentoMapper documentoMapper) {
        this.documentoMapper = documentoMapper;
    }

    @Override
    public SoggettoDto convertEntityToDtoImpl(Soggetto entity) {
        SoggettoDto dto = new SoggettoDto();
        dto.setNome(entity.getNome());
        dto.setCognome(entity.getCognome());
        dto.setCf(entity.getCf());
        dto.setPartitaIva(entity.getPartitaIva());
        dto.setIrreperibile(String.valueOf(entity.getIrreperibile()));
        dto.setRelataNotificaSoggettoNonReperibile(documentoMapper.convertEntityToDto(entity.getRelataNotificaSoggettoNonReperibile()));
        return dto;
    }

    @Override
    public Soggetto convertDtoToEntityImpl(SoggettoDto dto) throws SvildepException {
        Soggetto entity = new Soggetto();
        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setCf(dto.getCf());
        entity.setPartitaIva(dto.getPartitaIva());
        entity.setIrreperibile(Boolean.valueOf(dto.getIrreperibile()));
        entity.setRelataNotificaSoggettoNonReperibile(documentoMapper.convertDtoToEntity(dto.getRelataNotificaSoggettoNonReperibile()));
        return entity;
    }
}
