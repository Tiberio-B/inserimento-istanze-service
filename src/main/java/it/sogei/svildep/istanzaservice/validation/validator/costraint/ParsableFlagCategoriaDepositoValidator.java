package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagCategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSessoMF;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagCategoriaDeposito;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagCategoriaDepositoValidator implements
        ConstraintValidator<ParsableFlagCategoriaDeposito, String> {

    @Override
    public void initialize(ParsableFlagCategoriaDeposito field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagCategoriaDeposito.valueOf(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
