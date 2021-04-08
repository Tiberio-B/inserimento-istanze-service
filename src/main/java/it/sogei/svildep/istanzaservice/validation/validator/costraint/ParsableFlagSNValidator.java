package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagSN;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagSNValidator implements
        ConstraintValidator<ParsableFlagSN, String> {

    @Override
    public void initialize(ParsableFlagSN field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            Enum.valueOf(FlagSN.class, field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
