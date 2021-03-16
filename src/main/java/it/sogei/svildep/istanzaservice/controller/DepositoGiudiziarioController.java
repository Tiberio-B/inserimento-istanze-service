package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoGiudiziario")
public class DepositoGiudiziarioController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> post(@RequestHeader("authorization") String token, @Valid @RequestBody DepositoGiudiziarioDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(token, requestDto, bindingResult); }

}