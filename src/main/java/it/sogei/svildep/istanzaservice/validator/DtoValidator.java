package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public abstract class DtoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Dto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof Dto) {
            Dto dto = (Dto) obj;
            try {
                Long.parseLong(dto.getId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
