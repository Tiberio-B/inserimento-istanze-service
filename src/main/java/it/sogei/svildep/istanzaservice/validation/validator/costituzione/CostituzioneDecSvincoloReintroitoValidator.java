package it.sogei.svildep.istanzaservice.validation.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CostituzioneDecSvincoloReintroitoValidator extends CostituzioneDepositoValidator<CostituzioneDecSvincoloReintroitoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return CostituzioneDecSvincoloReintroitoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof CostituzioneDecSvincoloReintroitoDto) {
            CostituzioneDecSvincoloReintroitoDto dto = (CostituzioneDecSvincoloReintroitoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
