package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaRestituzioneDepositoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
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
            try {
                Long.parseLong(dto.getIntestatario().getSoggettoId());
                Long.parseLong(dto.getModalitaPagamentoId());
                for (CoinvolgimentoSoggettoDto soggettoObbligatorio : dto.getSoggettiObbligatori()) {
                    Long.parseLong(soggettoObbligatorio.getSoggettoId());
                    Long.parseLong(soggettoObbligatorio.getTipoCoinvolgimentoSoggettoId());
                }
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            try {
                Double.parseDouble(dto.getImportoRichiesto());
                FlagSN.valueOf(dto.getPagamentoASoggettiDeposito());
            } catch (NumberFormatException ex) {
                errors.rejectValue("importoRichiesto", Messages.erroreGenerico, Messages.erroreGenerico);
            } catch (IllegalArgumentException ex) {
                errors.rejectValue("pagamentoASoggettiDeposito", Messages.erroreGenerico, Messages.erroreGenerico);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
