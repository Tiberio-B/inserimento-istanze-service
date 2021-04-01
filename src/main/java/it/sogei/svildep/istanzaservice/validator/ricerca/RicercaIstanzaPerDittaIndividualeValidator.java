package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerDittaIndividualeDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class RicercaIstanzaPerDittaIndividualeValidator extends RicercaIstanzaValidator<RicercaIstanzaPerDittaIndividualeDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return RicercaIstanzaPerDittaIndividualeDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof RicercaIstanzaPerDittaIndividualeDto) {
            RicercaIstanzaPerDittaIndividualeDto dto = (RicercaIstanzaPerDittaIndividualeDto) obj;
            // TO-DO
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
