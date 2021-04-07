package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.validation.annotation.ParsableDate;
import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ParsableDateValidator implements
        ConstraintValidator<ParsableDate, String> {

    @Override
    public void initialize(ParsableDate field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            LocalDate.parse(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
