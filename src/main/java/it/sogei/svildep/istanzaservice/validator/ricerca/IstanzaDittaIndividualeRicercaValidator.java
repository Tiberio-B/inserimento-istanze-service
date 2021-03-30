package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.IstanzaDittaIndividualeRicercaDto;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public class IstanzaDittaIndividualeRicercaValidator extends IstanzaValidator<IstanzaDittaIndividualeRicercaDto> {

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
