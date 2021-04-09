package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSede;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSoggetto;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagTipoSoggetto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagTipoSoggettoValidator implements
        ConstraintValidator<ParsableFlagTipoSoggetto, String> {

    @Override
    public void initialize(ParsableFlagTipoSoggetto field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoSoggetto.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
