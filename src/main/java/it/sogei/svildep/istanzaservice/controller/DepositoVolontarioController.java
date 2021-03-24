package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaCostDepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoVolontarioDtoInserimento;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoVolontario")
public class DepositoVolontarioController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> inserimento(@Valid @RequestBody DepositoVolontarioDtoInserimento requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }
}
