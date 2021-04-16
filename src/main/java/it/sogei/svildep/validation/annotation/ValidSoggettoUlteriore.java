package it.sogei.svildep.validation.annotation;

import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.validator.SoggettoUlterioreValidator;

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
