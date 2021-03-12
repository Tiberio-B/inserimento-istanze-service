package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.repository.IRepository;

import java.util.List;

interface IService<E extends Entity, D extends Dto> {

    Mapper<E, D> getMapper();

    IRepository<E> getRepository();

    D get(Long id);

    List<D> getAll();

    D insert(D dto) throws SvildepException;

    boolean update(D dto) throws SvildepException;

    D delete(Long id);

    D delete(D dto) throws SvildepException;

    boolean deleteEffective(D dto) throws SvildepException;

    void drop();
}
