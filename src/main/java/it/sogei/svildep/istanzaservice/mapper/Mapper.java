package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Entity;

import java.util.*;

public interface Mapper<E extends Entity, D extends Dto> {

    D mapEntityToDtoImpl(E entity);

    E mapDtoToEntityImpl(D dto) throws SvildepException;

    default D mapEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = mapEntityToDtoImpl(entity);
        dto.setId(String.valueOf(entity.getId()));
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
            if (dto.getId() != null) entity.setId(Long.parseLong(dto.getId()));
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
