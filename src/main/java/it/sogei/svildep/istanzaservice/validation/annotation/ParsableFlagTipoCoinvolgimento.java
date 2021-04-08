package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoCoinvolgimentoValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoSoggettoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoCoinvolgimentoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoCoinvolgimento {
    String message() default Messages.erroreGenerico;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
