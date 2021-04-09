package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.entity.enums.FlagQualitaRichiedente;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoCoinvolgimento;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableFlagTipoCoinvolgimento;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.format.DateTimeParseException;

public class ParsableFlagTipoCoinvolgimentoValidator implements
        ConstraintValidator<ParsableFlagTipoCoinvolgimento, String> {

    @Override
    public void initialize(ParsableFlagTipoCoinvolgimento field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            FlagTipoCoinvolgimento.valueOf(field);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

}
