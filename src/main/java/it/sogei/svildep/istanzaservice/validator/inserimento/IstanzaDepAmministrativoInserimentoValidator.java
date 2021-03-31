package it.sogei.svildep.istanzaservice.validator.inserimento;

import it.sogei.svildep.istanzaservice.dto.ProprietarioCatastaleDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaDepAmministrativoInserimentoValidator extends IstanzaInserimentoValidator<IstanzaDepAmministrativoInserimentoDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDepAmministrativoInserimentoDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDepAmministrativoInserimentoDto) {
            IstanzaDepAmministrativoInserimentoDto dto = (IstanzaDepAmministrativoInserimentoDto) obj;
            try {
                Long.parseLong(dto.getDepositante().getSoggettoId());
                Long.parseLong(dto.getDepositante().getTipoCoinvolgimentoSoggettoId());
                Long.parseLong(dto.getAutoritaEspropriante().getSoggettoId());
                Long.parseLong(dto.getAutoritaEspropriante().getTipoCoinvolgimentoSoggettoId());
                Long.parseLong(dto.getOperaRegioneId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            try {
                for (ProprietarioCatastaleDto proprietarioCatastale : dto.getBeneEspropriato().getProprietariCatastali()) {
                    proprietarioCatastale.getCfPiva(); // TO-DO valida RegEx
                }
            } catch (Exception ex) {
                errors.rejectValue("cfPiva", Messages.erroreGenerico, Messages.erroreGenerico);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
