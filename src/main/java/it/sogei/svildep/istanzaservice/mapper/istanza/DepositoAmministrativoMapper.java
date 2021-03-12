package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.BeneMapper;
import it.sogei.svildep.istanzaservice.mapper.OperaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepositoAmministrativoMapper extends IstanzaMapper<DepositoAmministrativo, DepositoAmministrativoDto> {

    private final OperaMapper operaMapper;
    private final BeneMapper beneMapper;

    @Override
    public DepositoAmministrativoDto convertEntityToDtoImpl(DepositoAmministrativo entity) {
        DepositoAmministrativoDto dto = super.mapIstanzaEntityToDto(entity, new DepositoAmministrativoDto());
        dto.setDepositante(getSoggettoMapper().convertEntityToDto(entity.getDepositante()));
        dto.setAutoritaEspropriante(getSoggettoMapper().convertEntityToDto(entity.getAutoritaEspropriante()));
        dto.setDatiOpera(operaMapper.convertEntityToDto(entity.getDatiOpera()));
        dto.setBeneEspropriato(beneMapper.convertEntityToDto(entity.getBeneEspropriato()));
        return dto;
    }

    @Override
    public DepositoAmministrativo convertDtoToEntityImpl(DepositoAmministrativoDto dto) throws SvildepException {
        DepositoAmministrativo entity = super.mapIstanzaDtoToEntity(dto, new DepositoAmministrativo());
        entity.setDepositante(getSoggettoMapper().convertDtoToEntity(dto.getDepositante()));
        entity.setAutoritaEspropriante(getSoggettoMapper().convertDtoToEntity(dto.getAutoritaEspropriante()));
        entity.setDatiOpera(operaMapper.convertDtoToEntity(dto.getDatiOpera()));
        entity.setBeneEspropriato(beneMapper.convertDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }
}
