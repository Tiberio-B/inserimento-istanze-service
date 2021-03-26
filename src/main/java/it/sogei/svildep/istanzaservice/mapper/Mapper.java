package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

import java.time.LocalDateTime;
import java.util.*;

public interface Mapper<E extends BaseEntity, D extends Dto> {

    D mapEntityToDtoImpl(E entity);

    E mapDtoToEntityImpl(D dto) throws SvildepException;

    default D mapEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = mapEntityToDtoImpl(entity);
        dto.setId(String.valueOf(entity.getId()));
        dto.setUtenteAggiornamentoId(String.valueOf(entity.getIdUtenteAggiornamento()));
        dto.setUtenteInserimentoId(String.valueOf(entity.getIdUtenteInserimento()));
        dto.setTimestampAggiornamento(String.valueOf(entity.getTimestampAggiornamento()));
        dto.setTimestampInserimento(String.valueOf(entity.getTimestampInserimento()));
        return dto;
    }

    default List<D> mapEntityToDto(List<E> entities) {
        if (entities == null) return null;
        List<D> dtos = new ArrayList<>();
        for (E entity : entities) dtos.add(mapEntityToDto(entity));
        return dtos;
    }

    default E mapDtoToEntity(D dto) throws SvildepException {
        if (dto == null) return null;
        E entity;
        try {
            entity = mapDtoToEntityImpl(dto);
            if (dto.getId() != null) entity.setId(Long.parseLong(dto.getId()));
            if (dto.getUtenteAggiornamentoId() != null) entity.setIdUtenteAggiornamento(Long.parseLong(dto.getUtenteAggiornamentoId()));
            if (dto.getUtenteInserimentoId() != null) entity.setIdUtenteInserimento(Long.parseLong(dto.getUtenteInserimentoId()));
            if (dto.getTimestampAggiornamento() != null) entity.setTimestampAggiornamento(LocalDateTime.parse(dto.getTimestampAggiornamento()));
            if (dto.getTimestampInserimento() != null) entity.setTimestampInserimento(LocalDateTime.parse(dto.getTimestampInserimento()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getCause() +" "+ ex.getMessage());
        }
        return entity;
    }

    default List<E> mapDtoToEntity(List<D> dtos) throws SvildepException {
        if (dtos == null) return null;
        List<E> entities = new ArrayList<>();
        for (D dto : dtos) entities.add(mapDtoToEntity(dto));
        return entities;
    }


}
