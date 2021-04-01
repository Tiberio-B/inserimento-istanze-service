package it.sogei.svildep.istanzaservice.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CostituzioneDepGiudiziarioValidator extends CostituzioneDepositoValidator<CostituzioneDepGiudiziarioDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return CostituzioneDepGiudiziarioDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof CostituzioneDepGiudiziarioDto) {
            CostituzioneDepGiudiziarioDto dto = (CostituzioneDepGiudiziarioDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
