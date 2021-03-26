package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("decretoSvincoloReintroito")
public class DecretoSvincoloReintroitoController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody DecretoSvincoloReintroitoDtoInserimento requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
