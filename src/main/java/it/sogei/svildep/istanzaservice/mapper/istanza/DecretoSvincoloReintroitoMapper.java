package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DecretoSvincoloReintroitoMapper extends IstanzaMapper<DecretoSvincoloReintroitoDto> {

    @Override
    public DecretoSvincoloReintroitoDto mapEntityToDtoImpl(Istanza entity) {
        return super.fromIstanzaToDto(entity, new DecretoSvincoloReintroitoDto());
    }

    @Override
    public Istanza mapDtoToEntityImpl(DecretoSvincoloReintroitoDto dto) throws SvildepException {
        return super.fromDtoToIstanza(dto);
    }
}
