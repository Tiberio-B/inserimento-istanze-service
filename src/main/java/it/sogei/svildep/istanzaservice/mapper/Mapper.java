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
        dto.setIdUtenteAggiornamento(String.valueOf(entity.getIdUtenteAggiornamento()));
        dto.setIdUtenteInserimento(String.valueOf(entity.getIdUtenteInserimento()));
        dto.setTimestampAggiornamento(String.valueOf(entity.getTimestampAggiornamento()));
        dto.setTimestampInserimento(String.valueOf(entity.getTimestampInserimento()));
        return dto;
    }

    default Collection<D> mapEntityToDto(Collection<D> dtos, Collection<E> entities) {
        if (entities == null) return null;
        for (E entity : entities) dtos.add(mapEntityToDto(entity));
        return dtos;
    }

    default List<D> mapEntityToDto(List<E> entities) { return (List<D>) mapEntityToDto(new ArrayList<>(), entities); }

    default Set<D> mapEntityToDto(Set<E> entities) { return (Set<D>) mapEntityToDto(new HashSet<>(), entities); }

    default E mapDtoToEntity(D dto) throws SvildepException {
        if (dto == null) return null;
        E entity;
        try {
            entity = mapDtoToEntityImpl(dto);
            if (dto.getIdUtenteAggiornamento() != null) entity.setIdUtenteAggiornamento(Long.parseLong(dto.getIdUtenteAggiornamento()));
            if (dto.getIdUtenteInserimento() != null) entity.setIdUtenteInserimento(Long.parseLong(dto.getIdUtenteInserimento()));
            if (dto.getTimestampAggiornamento() != null) entity.setTimestampAggiornamento(LocalDateTime.parse(dto.getTimestampAggiornamento()));
            if (dto.getTimestampInserimento() != null) entity.setTimestampInserimento(LocalDateTime.parse(dto.getTimestampInserimento()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getCause() +" "+ ex.getMessage());
        }
        return entity;
    }

    default Collection<E> mapDtoToEntity(Collection<E> entities, Collection<D> dtos) throws SvildepException {
        if (dtos == null) return null;
        for (D dto : dtos) entities.add(mapDtoToEntity(dto));
        return entities;
    }

    default List<E> mapDtoToEntity(List<D> dtos) throws SvildepException { return (List<E>) mapDtoToEntity(new ArrayList<>(), dtos); }

    default Set<E> mapDtoToEntity(Set<D> dtos) throws SvildepException { return (Set<E>) mapDtoToEntity(new HashSet<>(), dtos); }

}
