package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.IstanzaDittaIndividualeRicercaDto;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDittaIndividualeRicercaValidator extends IstanzaRicercaValidator<IstanzaDittaIndividualeRicercaDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDittaIndividualeRicercaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDittaIndividualeRicercaDto) {
            IstanzaDittaIndividualeRicercaDto dto = (IstanzaDittaIndividualeRicercaDto) obj;
            // TO-DO
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
