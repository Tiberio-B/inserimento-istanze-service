package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoDirittoSoggettoValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoSedeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoDirittoSoggettoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoDirittoSoggetto {
    String message() default Messages.erroreTipoDirittoSoggetto;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
