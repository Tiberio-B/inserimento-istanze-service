package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoGiudiziarioMapper extends IstanzaMapper<DepositoGiudiziarioDto> {

    @Override
    public DepositoGiudiziarioDto mapEntityToDtoImpl(Istanza entity) {
        DepositoGiudiziarioDto dto = super.fromIstanzaToDto(entity, new DepositoGiudiziarioDto());
        dto.setVersante(getSoggettoMapper().mapEntityToDto(entity.getVersante()));
        dto.setAutoritaOrdinante(getSoggettoMapper().mapEntityToDto(entity.getAutoritaOrdinante()));
        dto.setSoggettoUlteriore(getSoggettoMapper().mapEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoGiudiziarioDto dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setVersante(getSoggettoMapper().mapDtoToEntity(dto.getVersante()));
        entity.setAutoritaOrdinante(getSoggettoMapper().mapDtoToEntity(dto.getAutoritaOrdinante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().mapDtoToEntity(dto.getSoggettoUlteriore()));
        return entity;
    }
}
