package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableDateTimeValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableDateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableDateTimeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableDateTime {
    String message() default Messages.erroreGenerico;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
