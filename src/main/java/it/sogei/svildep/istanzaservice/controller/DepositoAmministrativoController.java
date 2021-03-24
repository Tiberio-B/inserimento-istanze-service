package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaCostDepAmministrativiEsproprioDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoAmministrativoDtoInserimento;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoAmministrativo")
public class DepositoAmministrativoController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody DepositoAmministrativoDtoInserimento requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
