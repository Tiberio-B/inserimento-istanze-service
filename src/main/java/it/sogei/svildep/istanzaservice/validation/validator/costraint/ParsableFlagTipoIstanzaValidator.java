package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoDirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoIstanza;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagTipoIstanza;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagTipoIstanzaValidator implements
        ConstraintValidator<ParsableFlagTipoIstanza, String> {

    @Override
    public void initialize(ParsableFlagTipoIstanza field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoIstanza.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
