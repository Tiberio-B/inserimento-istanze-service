package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class IstanzaValidator extends DtoValidator {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDto) {
            IstanzaDto dto = (IstanzaDto) obj;
            try {
                IstanzaDto.QualitaRichiedente.valueOf(dto.getQualitaRichiedente());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("qualitaRichiedente", Messages.invalidQualitaRichiedenteCode, Messages.invalidQualitaRichiedenteMessage);
            }
            try {
                IstanzaDto.Tipo.valueOf(dto.getTipo());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("tipo", Messages.invalidTipoCode, Messages.invalidTipoMessage);
            }
            try {
                IstanzaDto.Stato.valueOf(dto.getStato());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("stato", Messages.invalidStatoCode, Messages.invalidStatoMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
