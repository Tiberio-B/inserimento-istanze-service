package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaInserimentoValidator<D extends IstanzaInserimentoDto> extends IstanzaValidator<D> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaInserimentoDto) {
            IstanzaInserimentoDto dto = (IstanzaInserimentoDto) obj;
            //TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
