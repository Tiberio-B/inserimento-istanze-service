package it.sogei.svildep.istanzaservice.validation.validator.costraint;

import it.sogei.svildep.istanzaservice.validation.annotation.ParsableDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class ParsableDateTimeValidator implements
        ConstraintValidator<ParsableDate, String> {

    @Override
    public void initialize(ParsableDate field) {
    }

    @Override
    public boolean isValid(String field,
                           ConstraintValidatorContext cxt) {
        try {
            LocalDateTime.parse(field);
            return true;
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

}
