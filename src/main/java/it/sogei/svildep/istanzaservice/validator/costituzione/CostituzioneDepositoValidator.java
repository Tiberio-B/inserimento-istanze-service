package it.sogei.svildep.istanzaservice.validator.costituzione;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import it.sogei.svildep.istanzaservice.validator.coinvolgimentoSoggetto.CoinvolgimentoSoggettoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CostituzioneDepositoValidator<D extends CostituzioneDepositoDto> extends IstanzaValidator<D> {

    @Autowired private CoinvolgimentoSoggettoValidator coinvolgimentoSoggettoValidator;

    @Override
    public boolean supports(Class<?> aClass) {
        return CostituzioneDepositoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof CostituzioneDepositoDto) {
            CostituzioneDepositoDto dto = (CostituzioneDepositoDto) obj;
            try {
                Long.parseLong(dto.getCategoriaDepositoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("categoriaDepositoId", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            for (CoinvolgimentoSoggettoDto coinvolgimentoSoggettoDto : dto.getCoinvolgimenti()) {
                coinvolgimentoSoggettoValidator.validate(coinvolgimentoSoggettoDto, errors);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
