package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public class IstanzaRicercaValidator extends IstanzaValidator<IstanzaRicercaDto> {

    @Override
    public boolean supports(Class<?> aClass) {

        return IstanzaRicercaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaRicercaDto) {
            IstanzaRicercaDto dto = (IstanzaRicercaDto) obj;
            if(dto.getDataIstanzaDa() != null){
                try{
                    LocalDate.parse(dto.getDataIstanzaDa());
                } catch (DateTimeParseException e){
                    errors.rejectValue("dataIstanzaDa", "invalidDate", "INVALID_DATE");
                }
            }
            if(dto.getDataIstanzaA() != null){
                try{
                    LocalDate.parse(dto.getDataIstanzaA());
                } catch (DateTimeParseException e){
                    errors.rejectValue("dataIstanzaA", "invalidDate", "INVALID_DATE");
                }
            }
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
