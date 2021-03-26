package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public abstract class DtoValidator<D extends Dto> implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Dto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof Dto) {
            Dto dto = (Dto) obj;
            try {
                if (dto.getUtenteInserimentoId() != null) Long.parseLong(dto.getUtenteInserimentoId());
                if (dto.getUtenteAggiornamentoId() != null) Long.parseLong(dto.getUtenteAggiornamentoId());
            } catch (NumberFormatException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidIdMessage);
            }
            try {
                if (dto.getTimestampAggiornamento() != null) LocalDateTime.parse(dto.getTimestampAggiornamento());
                if (dto.getTimestampInserimento() != null) LocalDateTime.parse(dto.getTimestampInserimento());
            } catch (DateTimeException ex) {
                errors.rejectValue("id", Messages.invalidIdCode, Messages.invalidDateMessage);
            }
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
