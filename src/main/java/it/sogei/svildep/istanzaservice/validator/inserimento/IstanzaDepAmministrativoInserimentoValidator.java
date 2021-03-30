package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepAmministrativoInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepAmministrativoInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepAmministrativoInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepAmministrativoInserimentoDto) {
            IstanzaDepAmministrativoInserimentoDto dto = (IstanzaDepAmministrativoInserimentoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
