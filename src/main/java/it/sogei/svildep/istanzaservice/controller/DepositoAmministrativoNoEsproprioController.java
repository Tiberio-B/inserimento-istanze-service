package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.DepositoAmministrativoNoEsproprioService;
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
@RequestMapping("depositoAmministrativoNoEsproprio")
public class DepositoAmministrativoNoEsproprioController extends IstanzaController<DepositoAmministrativoNoEsproprioDto> {
    
    private final DepositoAmministrativoNoEsproprioService service;

    @PostMapping
    public ResponseEntity<DepositoAmministrativoNoEsproprioDto> insertDepositoAmministrativoNoEsproprio(@Valid @RequestBody DepositoAmministrativoNoEsproprioDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
