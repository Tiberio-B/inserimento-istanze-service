package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.validator.IstanzaInserimentoValidator;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

@NoArgsConstructor
public abstract class InserimentoIstanzaController<D extends IstanzaInserimentoDto> {

    @Autowired private IstanzaService<D> service;
    @Autowired private IstanzaInserimentoValidator<D> istanzaInserimentoValidator;

    ResponseEntity<MessageDto> insert(D requestDto, BindingResult bindingResult) throws SvildepException {
        istanzaInserimentoValidator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

}
