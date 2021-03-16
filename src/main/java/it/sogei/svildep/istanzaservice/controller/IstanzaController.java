package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.service.external.AuthService;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public abstract class IstanzaController {

    @Autowired private AuthService authService;
    @Autowired private IstanzaValidator validator;
    @Autowired private IstanzaService service;

    public ResponseEntity<MessageDto> insert(String token, IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);
        validate(requestDto, bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

    private void validate(IstanzaDto requestDto, BindingResult bindingResult) throws BindingException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

}
