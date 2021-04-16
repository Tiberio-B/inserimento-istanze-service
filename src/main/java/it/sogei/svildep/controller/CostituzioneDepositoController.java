package it.sogei.svildep.controller;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.service.CostituzioneDepositoService;
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
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        requestDto.setInserimentoManuale(true);
        MessageDto response = getService().insert(requestDto);
        return ResponseEntity.status(response.getStatus()).body(response.getContent());
    }

    public abstract CostituzioneDepositoService<D> getService();

}
