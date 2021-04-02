package it.sogei.svildep.istanzaservice.validation.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.validation.validator.IstanzaValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public abstract class RicercaIstanzaValidator<D extends RicercaIstanzaDto> extends IstanzaValidator<D> {

    @Override
    public boolean supports(Class<?> aClass) {
        return RicercaIstanzaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof RicercaIstanzaDto) {
            RicercaIstanzaDto dto = (RicercaIstanzaDto) obj;
            if (dto.getDataDa() != null) {
                try {
                    LocalDate.parse(dto.getDataDa());
                } catch (DateTimeParseException e) {
                    errors.rejectValue("dataIstanzaDa", "invalidDate", "INVALID_DATE");
                }
            }
            if (dto.getDataA() != null) {
                try {
                    LocalDate.parse(dto.getDataA());
                } catch (DateTimeParseException e) {
                    errors.rejectValue("dataIstanzaA", "invalidDate", "INVALID_DATE");
                }
            }
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }

}
