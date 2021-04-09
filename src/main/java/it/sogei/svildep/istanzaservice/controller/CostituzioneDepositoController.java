package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Component
@NoArgsConstructor
@Getter
@Setter
public abstract class CostituzioneDepositoController<D extends CostituzioneDepositoDto> {

    @PostMapping
    ResponseEntity<String> insert(@Valid @RequestBody D requestDto, BindingResult bindingResult) throws SvildepException {
        getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        requestDto.setInserimentoManuale(FlagSN.S);
        MessageDto response = getService().insert(requestDto);
        return ResponseEntity.status(response.getStatus()).body(response.getContent());
    }

    public abstract CostituzioneDepositoService<D> getService();

    public abstract CostituzioneDepositoValidator<D> getValidator();

}
