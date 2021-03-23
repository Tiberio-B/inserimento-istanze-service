package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoCauzionaleMapper extends IstanzaMapper<DepositoCauzionaleDto> {

    @Override
    public DepositoCauzionaleDto mapEntityToDtoImpl(Istanza entity) {
        DepositoCauzionaleDto dto = super.fromIstanzaToDto(entity, new DepositoCauzionaleDto());
        dto.setProprietario(super.getSoggettoMapper().mapEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(super.getSoggettoMapper().mapEntityToDto(entity.getEnteRichiedente()));
        dto.setProprietario(getSoggettoMapper().mapEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(getSoggettoMapper().mapEntityToDto(entity.getEnteRichiedente()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoCauzionaleDto dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setProprietario(super.getSoggettoMapper().mapDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(super.getSoggettoMapper().mapDtoToEntity(dto.getEnteRichiedente()));
        entity.setProprietario(getSoggettoMapper().mapDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(getSoggettoMapper().mapDtoToEntity(dto.getEnteRichiedente()));
        return entity;
    }
}
