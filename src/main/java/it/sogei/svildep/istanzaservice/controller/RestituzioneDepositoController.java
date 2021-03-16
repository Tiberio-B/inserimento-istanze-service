package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("restituzioneDeposito")
public class RestituzioneDepositoController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> post(@RequestHeader("authorization") String token, @Valid @RequestBody RestituzioneDepositoDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(token, requestDto, bindingResult); }

}
