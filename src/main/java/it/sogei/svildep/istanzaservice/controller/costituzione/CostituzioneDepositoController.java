package it.sogei.svildep.istanzaservice.controller.costituzione;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.costituzione.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
@NoArgsConstructor
@Getter
@Setter
public abstract class CostituzioneDepositoController<D extends CostituzioneDepositoDto> {

    ResponseEntity<String> insert(D requestDto, BindingResult bindingResult) throws SvildepException {
        getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        requestDto.setInserimentoManuale(true);
        MessageDto response = getService().insert(requestDto);
        return ResponseEntity.status(response.getStatus()).body(response.getContent());
    }

    public abstract CostituzioneDepositoService<D> getService();

    public abstract CostituzioneDepositoValidator<D> getValidator();

}
