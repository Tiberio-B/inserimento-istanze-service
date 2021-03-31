package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepVolontarioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepVolontarioInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepVolontarioInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepVolontarioInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepVolontarioInserimentoDto) {
            IstanzaDepVolontarioInserimentoDto dto = (IstanzaDepVolontarioInserimentoDto) obj;
            /*
            try {
                Long.parseLong(dto.getProprietario().getSoggettoId());
                Long.parseLong(dto.getProprietario().getTipoSoggettoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            */
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
