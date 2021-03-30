package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaRestituzioneDepositoInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaRestituzioneDepositoInserimentoValidator extends IstanzaInserimentoValidator<IstanzaRestituzioneDepositoInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaRestituzioneDepositoInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaRestituzioneDepositoInserimentoDto) {
            IstanzaRestituzioneDepositoInserimentoDto dto = (IstanzaRestituzioneDepositoInserimentoDto) obj;
            // TO-DO
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
