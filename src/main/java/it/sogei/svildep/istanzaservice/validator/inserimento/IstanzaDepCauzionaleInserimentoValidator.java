package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepCauzionaleInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepCauzionaleInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepCauzionaleInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepCauzionaleInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepCauzionaleInserimentoDto) {
            IstanzaDepCauzionaleInserimentoDto dto = (IstanzaDepCauzionaleInserimentoDto) obj;
            /*
            try {
                Long.parseLong(dto.getProprietario().getSoggettoId());
                Long.parseLong(dto.getProprietario().getTipoSoggettoId());
                Long.parseLong(dto.getEnteCauzionato().getSoggettoId());
                Long.parseLong(dto.getEnteCauzionato().getTipoSoggettoId());
                Long.parseLong(dto.getQualitaRichiedenteId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            */
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
