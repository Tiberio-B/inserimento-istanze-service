package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepGiudiziarioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepGiudiziarioInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepGiudiziarioInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepGiudiziarioInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepGiudiziarioInserimentoDto) {
            IstanzaDepGiudiziarioInserimentoDto dto = (IstanzaDepGiudiziarioInserimentoDto) obj;
            try {
                Long.parseLong(dto.getVersante().getSoggettoId());
                Long.parseLong(dto.getVersante().getTipoCoinvolgimentoSoggettoId());
                Long.parseLong(dto.getAutoritaOrdinante().getSoggettoId());
                Long.parseLong(dto.getAutoritaOrdinante().getTipoCoinvolgimentoSoggettoId());
                Long.parseLong(dto.getSoggettoUlteriore().getSoggettoId());
                Long.parseLong(dto.getSoggettoUlteriore().getTipoCoinvolgimentoSoggettoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
