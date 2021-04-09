package it.sogei.svildep.istanzaservice.validation.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CostituzioneRestituzioneDepValidator extends CostituzioneDepositoValidator<CostituzioneRestituzioneDepDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return CostituzioneRestituzioneDepDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof CostituzioneRestituzioneDepDto) {
            CostituzioneRestituzioneDepDto dto = (CostituzioneRestituzioneDepDto) obj;
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
