package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoIstanzaValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoSoggettoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoSoggettoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoSoggetto {
    String message() default Messages.erroreTipoSoggetto;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
