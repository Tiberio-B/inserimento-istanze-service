package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativoNoEsproprio;
import org.springframework.stereotype.Component;

@Component
public class DepositoAmministrativoNoEsproprioMapper extends IstanzaMapper<DepositoAmministrativoNoEsproprio, DepositoAmministrativoNoEsproprioDto> {

    @Override
    public DepositoAmministrativoNoEsproprioDto convertEntityToDtoImpl(DepositoAmministrativoNoEsproprio entity) {
        DepositoAmministrativoNoEsproprioDto dto = super.mapIstanzaEntityToDto(entity, new DepositoAmministrativoNoEsproprioDto());
        dto.setVersante(getSoggettoMapper().convertEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(getSoggettoMapper().convertEntityToDto(entity.getUlterioreSoggetto()));
        return dto;
    }

    @Override
    public DepositoAmministrativoNoEsproprio convertDtoToEntityImpl(DepositoAmministrativoNoEsproprioDto dto) throws SvildepException {
        DepositoAmministrativoNoEsproprio entity = super.mapIstanzaDtoToEntity(dto, new DepositoAmministrativoNoEsproprio());
        entity.setVersante(getSoggettoMapper().convertDtoToEntity(dto.getVersante()));
        entity.setUlterioreSoggetto(getSoggettoMapper().convertDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }
}
