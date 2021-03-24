package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.RicercaIstanzaDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public abstract class IstanzaValidator extends DtoValidator {


}
