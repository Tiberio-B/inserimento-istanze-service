package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerSoggettoFisicoDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class RicercaIstanzaPerSoggettoFisicoValidator extends RicercaIstanzaValidator<RicercaIstanzaPerSoggettoFisicoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return RicercaIstanzaPerSoggettoFisicoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof RicercaIstanzaDto) {
            RicercaIstanzaPerSoggettoFisicoDto dto = (RicercaIstanzaPerSoggettoFisicoDto) obj;
            // TO-DO
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
