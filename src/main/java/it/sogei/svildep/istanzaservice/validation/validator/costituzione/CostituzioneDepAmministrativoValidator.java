package it.sogei.svildep.istanzaservice.validation.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.ProprietarioCatastaleDto;
import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CostituzioneDepAmministrativoValidator extends CostituzioneDepositoValidator<CostituzioneDepAmministrativoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return CostituzioneDepAmministrativoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof CostituzioneDepAmministrativoDto) {
            CostituzioneDepAmministrativoDto dto = (CostituzioneDepAmministrativoDto) obj;
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
