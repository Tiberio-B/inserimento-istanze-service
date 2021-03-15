package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Istanza;
import org.springframework.stereotype.Component;

@Component
public class DepositoVolontarioMapper extends IstanzaMapper<DepositoVolontarioDto> {

    @Override
    public DepositoVolontarioDto mapEntityToDtoImpl(Istanza entity) {
        return super.fromIstanzaToDto(entity, new DepositoVolontarioDto());
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoVolontarioDto dto) throws SvildepException {
        return super.fromDtoToIstanza(dto);
    }
}
