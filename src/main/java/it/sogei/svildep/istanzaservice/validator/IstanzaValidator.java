package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.QualitaRichiedente;
import it.sogei.svildep.istanzaservice.exception.Messages;
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
