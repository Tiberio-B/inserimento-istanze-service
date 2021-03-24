package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaCostDepAmministrativoNonEsproprioDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoAmministrativoNoEsproprioDtoInserimento;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoAmministrativoNoEsproprio")
public class DepositoAmministrativoNoEsproprioController extends IstanzaController {

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody DepositoAmministrativoNoEsproprioDtoInserimento requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
