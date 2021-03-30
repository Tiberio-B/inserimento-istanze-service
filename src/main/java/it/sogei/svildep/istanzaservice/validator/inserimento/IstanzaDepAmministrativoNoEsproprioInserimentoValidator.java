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
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
