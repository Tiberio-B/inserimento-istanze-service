package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagSessoMFValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoSedeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagSessoMFValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagSessoMF {
    String message() default Messages.erroreSesso;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
