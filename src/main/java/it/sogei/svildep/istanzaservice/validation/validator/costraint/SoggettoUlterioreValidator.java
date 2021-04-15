package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.validation.annotation.ValidSoggettoUlteriore;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class SoggettoUlterioreValidator implements
        ConstraintValidator<ValidSoggettoUlteriore, Object[]> {

    @Override
    public void initialize(ValidSoggettoUlteriore obj) {
    }

    @Override
    public boolean isValid(Object[] value, ConstraintValidatorContext cxt) {

        if (value[0] == null || value[1] == null || value[2] == null) {
            return false;
        }

        if (!(value[0] instanceof String && value[1] instanceof String && value[2] instanceof String)) {
            return false;
        }

        return value[0].equals(FlagSN.N.name()) && ((String) value[1]).isBlank() || ((String) value[2]).isBlank();
    }

}
