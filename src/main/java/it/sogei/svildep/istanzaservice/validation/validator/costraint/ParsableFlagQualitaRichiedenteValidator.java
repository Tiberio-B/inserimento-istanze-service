package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagCategoriaDeposito;
import it.sogei.svildep.istanzaservice.entity.enums.FlagQualitaRichiedente;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagQualitaRichiedente;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagQualitaRichiedenteValidator implements
        ConstraintValidator<ParsableFlagQualitaRichiedente, String> {

    @Override
    public void initialize(ParsableFlagQualitaRichiedente field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagQualitaRichiedente.valueOf(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
