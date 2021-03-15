package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.external.AuthService;
import it.sogei.svildep.istanzaservice.service.external.IstanzaService;
import it.sogei.svildep.istanzaservice.service.external.RtsService;
import it.sogei.svildep.istanzaservice.service.external.SoggettoService;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public abstract class IstanzaController {

    @Autowired private IstanzaValidator validator;

    @Autowired private AuthService authService;
    @Autowired private SoggettoService soggettoService;
    @Autowired private RtsService rtsService;
    @Autowired private IstanzaService istanzaService;

    public ResponseEntity<MessageDto> insert(String token, IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceLayerMock(requestDto));
    }

    private MessageDto serviceLayerMock(IstanzaDto requestDto) throws SvildepException {
        MessageDto response = soggettoService.verificaSoggettiMock(requestDto.getRichiedente());
        if (response.isError()) throw new SvildepException(response);

        response = rtsService.inserimentoInFascicoloMock(requestDto.getAllegati());
        if (response.isError()) throw new SvildepException(response);

        response = istanzaService.inserimentoIstanzaMock(requestDto);
        return response;
    }
}
