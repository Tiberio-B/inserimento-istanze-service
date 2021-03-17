package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class IstanzaValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Dto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof IstanzaDto) {
            IstanzaDto dto = (IstanzaDto) obj;
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
