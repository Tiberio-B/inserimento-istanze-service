package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.validation.annotation.ValidSvildepId;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SvildepIdValidator implements
        ConstraintValidator<ValidSvildepId, String> {

    @Override
    public void initialize(ValidSvildepId svildepId) {
    }

    @Override
    public boolean isValid(String svildepId,
                           ConstraintValidatorContext cxt) {
        try {
            Long.parseLong(svildepId);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
