package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.DecretoSvincoloReintroito;
import org.springframework.stereotype.Component;

@Component
public class DecretoSvincoloReintroitoMapper extends IstanzaMapper<DecretoSvincoloReintroito, DecretoSvincoloReintroitoDto> {

    @Override
    public DecretoSvincoloReintroitoDto convertEntityToDtoImpl(DecretoSvincoloReintroito entity) {
        return super.mapIstanzaEntityToDto(entity, new DecretoSvincoloReintroitoDto());
    }

    @Override
    public DecretoSvincoloReintroito convertDtoToEntityImpl(DecretoSvincoloReintroitoDto dto) throws SvildepException {
        return super.mapIstanzaDtoToEntity(dto, new DecretoSvincoloReintroito());
    }
}
