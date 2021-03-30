package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepVolontarioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepVolontarioInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepVolontarioInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepVolontarioInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepVolontarioInserimentoDto) {
            IstanzaDepVolontarioInserimentoDto dto = (IstanzaDepVolontarioInserimentoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
