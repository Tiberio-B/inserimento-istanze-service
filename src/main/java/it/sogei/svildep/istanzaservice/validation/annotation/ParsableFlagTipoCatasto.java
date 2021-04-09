package it.sogei.svildep.istanzaservice.validation.annotation;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoCatastoValidator;
import it.sogei.svildep.istanzaservice.validation.validator.costraint.ParsableFlagTipoSedeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParsableFlagTipoCatastoValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParsableFlagTipoCatasto {
    String message() default Messages.erroreTipoCatasto;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
