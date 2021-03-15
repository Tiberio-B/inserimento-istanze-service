package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.Dto;
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
        if (obj instanceof Dto) {
            Dto dto = (Dto) obj;
            //TO-DO
        }
        else errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
