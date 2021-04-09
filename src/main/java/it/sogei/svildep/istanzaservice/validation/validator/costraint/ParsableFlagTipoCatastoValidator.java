package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoCatasto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSede;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagTipoSede;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagTipoCatastoValidator implements
        ConstraintValidator<ParsableFlagTipoSede, String> {

    @Override
    public void initialize(ParsableFlagTipoSede field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoCatasto.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
