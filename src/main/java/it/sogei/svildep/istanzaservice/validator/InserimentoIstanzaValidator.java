package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.TipoIstanza;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class InserimentoIstanzaValidator extends IstanzaValidator {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDtoInserimento.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        super.validate(obj, errors);
        if (obj instanceof IstanzaDtoInserimento) {
            IstanzaDtoInserimento dto = (IstanzaDtoInserimento) obj;
            try {
                Istanza.QualitaRichiedente.valueOf(dto.getQualitaRichiedente());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("qualitaRichiedente", Messages.invalidQualitaRichiedenteCode, Messages.invalidQualitaRichiedenteMessage);
            }
            try {
                TipoIstanza.Tipo.valueOf(dto.getTipo());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("tipo", Messages.invalidTipoCode, Messages.invalidTipoMessage);
            }
            try {
                StatoIstanza.Stato.valueOf(dto.getStato());
            }
            catch (IllegalArgumentException ex) {
                errors.rejectValue("stato", Messages.invalidStatoCode, Messages.invalidStatoMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
