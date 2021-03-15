package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Istanza;
import org.springframework.stereotype.Component;

@Component
public class DepositoAmministrativoNoEsproprioMapper extends IstanzaMapper<DepositoAmministrativoNoEsproprioDto> {

    @Override
    public DepositoAmministrativoNoEsproprioDto mapEntityToDtoImpl(Istanza entity) {
        DepositoAmministrativoNoEsproprioDto dto = super.fromIstanzaToDto(entity, new DepositoAmministrativoNoEsproprioDto());
        dto.setVersante(getSoggettoMapper().mapEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(getSoggettoMapper().mapEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoAmministrativoNoEsproprioDto dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setVersante(getSoggettoMapper().mapDtoToEntity(dto.getVersante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().mapDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }
}
