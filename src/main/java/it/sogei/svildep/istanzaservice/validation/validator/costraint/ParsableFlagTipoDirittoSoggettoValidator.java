package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagCategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoDirittoSoggetto;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagTipoDirittoSoggetto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagTipoDirittoSoggettoValidator implements
        ConstraintValidator<ParsableFlagTipoDirittoSoggetto, String> {

    @Override
    public void initialize(ParsableFlagTipoDirittoSoggetto field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoDirittoSoggetto.valueOf(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
