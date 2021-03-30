package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepGiudiziarioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepGiudiziarioInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepGiudiziarioInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepGiudiziarioInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepGiudiziarioInserimentoDto) {
            IstanzaDepGiudiziarioInserimentoDto dto = (IstanzaDepGiudiziarioInserimentoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
