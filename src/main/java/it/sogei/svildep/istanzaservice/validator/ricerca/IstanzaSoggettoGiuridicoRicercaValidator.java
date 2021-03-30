package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoGiuridicoRicercaDto;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public class IstanzaSoggettoGiuridicoRicercaValidator extends IstanzaValidator<IstanzaSoggettoGiuridicoRicercaDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaSoggettoGiuridicoRicercaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaSoggettoGiuridicoRicercaDto) {
            IstanzaSoggettoGiuridicoRicercaDto dto = (IstanzaSoggettoGiuridicoRicercaDto) obj;
            // TO-DO
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
