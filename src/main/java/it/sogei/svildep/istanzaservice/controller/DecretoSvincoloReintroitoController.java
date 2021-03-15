package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.DecretoSvincoloReintroitoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("decretoSvincoloReintroito")
public class DecretoSvincoloReintroitoController extends IstanzaController<DecretoSvincoloReintroitoDto> {
    
    private final DecretoSvincoloReintroitoService service;

    @PostMapping
    public ResponseEntity<DecretoSvincoloReintroitoDto> insertDecretoSvincoloReintroito(@Valid @RequestBody DecretoSvincoloReintroitoDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
