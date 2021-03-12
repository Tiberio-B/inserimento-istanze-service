package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoGiudiziario;
import org.springframework.stereotype.Component;

@Component
public class DepositoGiudiziarioMapper extends IstanzaMapper<DepositoGiudiziario, DepositoGiudiziarioDto> {

    @Override
    public DepositoGiudiziarioDto convertEntityToDtoImpl(DepositoGiudiziario entity) {
        DepositoGiudiziarioDto dto = super.mapIstanzaEntityToDto(entity, new DepositoGiudiziarioDto());
        dto.setVersante(getSoggettoMapper().convertEntityToDto(entity.getVersante()));
        dto.setAutoritaOrdinante(getSoggettoMapper().convertEntityToDto(entity.getAutoritaOrdinante()));
        dto.setSoggettoUlteriore(getSoggettoMapper().convertEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public DepositoGiudiziario convertDtoToEntityImpl(DepositoGiudiziarioDto dto) throws SvildepException {
        DepositoGiudiziario entity = super.mapIstanzaDtoToEntity(dto, new DepositoGiudiziario());
        entity.setVersante(getSoggettoMapper().convertDtoToEntity(dto.getVersante()));
        entity.setAutoritaOrdinante(getSoggettoMapper().convertDtoToEntity(dto.getAutoritaOrdinante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().convertDtoToEntity(dto.getSoggettoUlteriore()));
        return entity;
    }
}
