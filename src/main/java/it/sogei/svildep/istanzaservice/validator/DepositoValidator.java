package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.SoggettoOldDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class DepositoValidator extends DtoValidator {

    @Override
    public boolean supports(Class<?> aClass) {
        return SoggettoOldDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof SoggettoOldDto) {
            SoggettoOldDto dto = (SoggettoOldDto) obj;
            try {
                SoggettoOldDto.Sesso.valueOf(dto.getSesso());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("sesso", Messages.invalidSessoCode, Messages.invalidSessoMessage);
            }
            try {
                SoggettoOldDto.Tipo.valueOf(dto.getTipo());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("tipo", Messages.invalidTipoCode, Messages.invalidTipoMessage);
            }
            try {
                SoggettoOldDto.Categoria.valueOf(dto.getCategoria());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("categoria", Messages.invalidCategoriaCode, Messages.invalidCategoriaMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
