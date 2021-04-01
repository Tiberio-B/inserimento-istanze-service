package it.sogei.svildep.istanzaservice.validator.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerSoggettoGiuridicoDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class RicercaIstanzaPerSoggettoGiuridicoValidator extends RicercaIstanzaValidator<RicercaIstanzaPerSoggettoGiuridicoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return RicercaIstanzaPerSoggettoGiuridicoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof RicercaIstanzaPerSoggettoGiuridicoDto) {
            RicercaIstanzaPerSoggettoGiuridicoDto dto = (RicercaIstanzaPerSoggettoGiuridicoDto) obj;
            // TO-DO
        }
        else
            errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
