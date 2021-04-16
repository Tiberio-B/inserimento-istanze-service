package it.sogei.svildep.validation.validator;

import it.sogei.svildep.dto.istanza.IstanzaDto;
import it.sogei.svildep.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public abstract class IstanzaValidator<D extends IstanzaDto> extends DtoValidator<D> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof IstanzaDto) {
            IstanzaDto dto = (IstanzaDto) obj;
            try {
                Long.parseLong(dto.getQualitaRichiedenteId());
            }
            catch (NumberFormatException ex) {
                errors.rejectValue("qualitaRichiedente", Messages.invalidQualitaRichiedenteCode, Messages.invalidQualitaRichiedenteMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }

}
