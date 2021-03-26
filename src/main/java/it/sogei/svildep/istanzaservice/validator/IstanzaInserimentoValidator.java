package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaInserimentoValidator<D extends IstanzaInserimentoDto> extends IstanzaValidator<D> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaInserimentoDto) {
            IstanzaInserimentoDto dto = (IstanzaInserimentoDto) obj;
            try {
                IstanzaInserimentoDto.QualitaRichiedente.valueOf(dto.getQualitaRichiedente());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("qualitaRichiedente", Messages.invalidQualitaRichiedenteCode, Messages.invalidQualitaRichiedenteMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}