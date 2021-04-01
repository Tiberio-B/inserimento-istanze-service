package it.sogei.svildep.istanzaservice.validator.coinvolgimentoSoggetto;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validator.DtoValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CoinvolgimentoSoggettoValidator extends DtoValidator<CoinvolgimentoSoggettoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return CoinvolgimentoSoggettoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof CoinvolgimentoSoggettoDto) {
            CoinvolgimentoSoggettoDto dto = (CoinvolgimentoSoggettoDto) obj;
            try {
                Long.parseLong(dto.getSoggettoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("soggettoId", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            try {
                Long.parseLong(dto.getTipoCoinvolgimentoSoggettoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("tipoCoinvolgimentoSoggettoid", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
