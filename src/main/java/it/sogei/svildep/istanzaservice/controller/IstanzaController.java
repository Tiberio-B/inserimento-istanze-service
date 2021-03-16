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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public abstract class IstanzaController {

    @Autowired private AuthService authService;
    @Autowired private IstanzaValidator validator;
    @Autowired private IstanzaService service;

    public ResponseEntity<MessageDto> insert(String token, IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);
        validate(requestDto, bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<IstanzaDto>> list(@RequestHeader("authorization") String token) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDto> get(@RequestHeader("authorization") String token, @PathVariable Long id) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);
        IstanzaDto dto = service.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    private void validate(IstanzaDto requestDto, BindingResult bindingResult) throws BindingException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

}
