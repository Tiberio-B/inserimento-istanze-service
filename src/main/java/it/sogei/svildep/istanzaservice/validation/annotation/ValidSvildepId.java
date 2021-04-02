package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.SvildepIdValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SvildepIdValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidSvildepId {
    String message() default Messages.invalidIdMessage;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
