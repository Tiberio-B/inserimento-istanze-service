package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDecSvincoloReintroitoInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDecSvincoloReintroitoInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDecSvincoloReintroitoInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDecSvincoloReintroitoInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDecSvincoloReintroitoInserimentoDto) {
            IstanzaDecSvincoloReintroitoInserimentoDto dto = (IstanzaDecSvincoloReintroitoInserimentoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
