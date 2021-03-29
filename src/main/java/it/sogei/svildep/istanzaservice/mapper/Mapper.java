package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;

public interface Mapper<E extends BaseEntity, D extends SvildepDto> extends EntityToDtoMapper<E, D>, DtoToEntityMapper<E, D> {

}
