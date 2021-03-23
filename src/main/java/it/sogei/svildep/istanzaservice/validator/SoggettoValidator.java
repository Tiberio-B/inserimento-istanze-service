package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SoggettoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return SoggettoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof SoggettoDto) {
            SoggettoDto dto = (SoggettoDto) obj;
            try {
                SoggettoDto.Sesso.valueOf(dto.getSesso());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("sesso", Messages.invalidSessoCode, Messages.invalidSessoMessage);
            }
            try {
                SoggettoDto.Tipo.valueOf(dto.getTipo());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("tipo", Messages.invalidTipoCode, Messages.invalidTipoMessage);
            }
            try {
                SoggettoDto.Categoria.valueOf(dto.getCategoria());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("categoria", Messages.invalidCategoriaCode, Messages.invalidCategoriaMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
