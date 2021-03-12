package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoVolontario;
import org.springframework.stereotype.Component;

@Component
public class DepositoVolontarioMapper extends IstanzaMapper<DepositoVolontario, DepositoVolontarioDto> {

    @Override
    public DepositoVolontarioDto convertEntityToDtoImpl(DepositoVolontario entity) {
        return super.mapIstanzaEntityToDto(entity, new DepositoVolontarioDto());
    }

    @Override
    public DepositoVolontario convertDtoToEntityImpl(DepositoVolontarioDto dto) throws SvildepException {
        return super.mapIstanzaDtoToEntity(dto, new DepositoVolontario());
    }
}
