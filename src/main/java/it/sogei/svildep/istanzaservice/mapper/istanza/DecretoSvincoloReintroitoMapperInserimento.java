package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DecretoSvincoloReintroitoDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DecretoSvincoloReintroitoMapperInserimento extends InserimentoIstanzaMapper<DecretoSvincoloReintroitoDtoInserimento> {

    @Override
    public DecretoSvincoloReintroitoDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        return super.fromIstanzaToDto(entity, new DecretoSvincoloReintroitoDtoInserimento());
    }

    @Override
    public Istanza mapDtoToEntityImpl(DecretoSvincoloReintroitoDtoInserimento dto) throws SvildepException {
        return super.fromDtoToIstanza(dto);
    }
}
