package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagStatoIstanzaValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoIstanzaValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagStatoIstanzaValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagStatoIstanza {
    String message() default Messages.erroreStatoIstanza;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
