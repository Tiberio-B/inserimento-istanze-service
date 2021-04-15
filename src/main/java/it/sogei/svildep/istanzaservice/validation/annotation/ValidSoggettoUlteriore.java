package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableDateValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.SoggettoUlterioreValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SoggettoUlterioreValidator.class)
@Target( { ElementType.METHOD, ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSoggettoUlteriore {
    String message() default Messages.erroreSoggettoUlteriore;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
