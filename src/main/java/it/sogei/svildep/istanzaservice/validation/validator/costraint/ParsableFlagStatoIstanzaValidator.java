package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagSN;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagStatoIstanza;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagStatoIstanzaValidator implements
        ConstraintValidator<ParsableFlagStatoIstanza, String> {

    @Override
    public void initialize(ParsableFlagStatoIstanza field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagStatoIstanza.valueOf(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
