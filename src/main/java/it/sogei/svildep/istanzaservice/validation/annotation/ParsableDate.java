package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableDateValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableLongValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableDateValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableDate {
    String message() default Messages.erroreData;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
