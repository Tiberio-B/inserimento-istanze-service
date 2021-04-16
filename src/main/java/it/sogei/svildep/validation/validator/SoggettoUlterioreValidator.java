package it.sogei.svildep.validation.validator;

import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.validation.annotation.ValidSoggettoUlteriore;

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

        if (value[0] == null || value[1] == null || value[2] == null) return false;

        if (value[0] instanceof String && value[1] instanceof String && value[2] instanceof String) {
            String soggettoNonIdentificato = (String) value[0];
            String nome = (String) value[1];
            String cognome = (String) value[2];
            return soggettoNonIdentificato.equals(FlagSN.S.name()) || !( nome.isBlank()||cognome.isBlank() );
        } else return false;
    }

}
