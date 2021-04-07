package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParsableLongValidator implements
        ConstraintValidator<ParsableLong, String> {

    @Override
    public void initialize(ParsableLong field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            Long.parseLong(field);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
