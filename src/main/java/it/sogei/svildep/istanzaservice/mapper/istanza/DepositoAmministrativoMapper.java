package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.BeneMapper;
import it.sogei.svildep.istanzaservice.mapper.OperaMapper;
import it.sogei.svildep.istanzaservice.model.Istanza;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepositoAmministrativoMapper extends IstanzaMapper<DepositoAmministrativoDto> {

    private final OperaMapper operaMapper;
    private final BeneMapper beneMapper;

    @Override
    public DepositoAmministrativoDto mapEntityToDtoImpl(Istanza entity) {
        DepositoAmministrativoDto dto = super.fromIstanzaToDto(entity, new DepositoAmministrativoDto());
        dto.setDepositante(getSoggettoMapper().mapEntityToDto(entity.getDepositante()));
        dto.setAutoritaEspropriante(getSoggettoMapper().mapEntityToDto(entity.getAutoritaEspropriante()));
        dto.setDatiOpera(operaMapper.mapEntityToDto(entity.getDatiOpera()));
        dto.setBeneEspropriato(beneMapper.mapEntityToDto(entity.getBeneEspropriato()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoAmministrativoDto dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setDepositante(getSoggettoMapper().mapDtoToEntity(dto.getDepositante()));
        entity.setAutoritaEspropriante(getSoggettoMapper().mapDtoToEntity(dto.getAutoritaEspropriante()));
        entity.setDatiOpera(operaMapper.mapDtoToEntity(dto.getDatiOpera()));
        entity.setBeneEspropriato(beneMapper.mapDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }
}
