package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoNoEsproprioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepAmministrativoNoEsproprioInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepAmministrativoNoEsproprioInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepAmministrativoNoEsproprioInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepAmministrativoNoEsproprioInserimentoDto) {
            IstanzaDepAmministrativoNoEsproprioInserimentoDto dto = (IstanzaDepAmministrativoNoEsproprioInserimentoDto) obj;
            try {
                Long.parseLong(dto.getVersante().getSoggettoId());
                Long.parseLong(dto.getVersante().getTipoCoinvolgimentoSoggettoId());
                Long.parseLong(dto.getSoggettoUlteriore().getSoggettoId());
                Long.parseLong(dto.getSoggettoUlteriore().getTipoCoinvolgimentoSoggettoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
