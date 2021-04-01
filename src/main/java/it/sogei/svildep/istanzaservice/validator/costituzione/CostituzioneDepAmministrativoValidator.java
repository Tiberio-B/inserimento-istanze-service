package it.sogei.svildep.istanzaservice.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo.ProprietarioCatastaleDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo.CostituzioneDepAmministrativoDto;
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
            try {
                Long.parseLong(dto.getOperaRegioneId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            try {
                for (ProprietarioCatastaleDto proprietarioCatastale : dto.getBeneEspropriato().getProprietariCatastali()) {
                    proprietarioCatastale.getCfPiva(); // TO-DO valida RegEx
                }
            } catch (Exception ex) {
                errors.rejectValue("cfPiva", Messages.erroreGenerico, Messages.erroreGenerico);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
