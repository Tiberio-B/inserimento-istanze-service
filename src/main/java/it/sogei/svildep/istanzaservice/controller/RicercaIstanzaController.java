package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.ListaRicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("ricerca")
public class RicercaIstanzaController extends IstanzaController{

    @PostMapping
    public ResponseEntity<List<ListaRicercaIstanzaDto>> ricerca(@RequestHeader("authorization") String token, @Valid @RequestBody RicercaIstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return list(token, requestDto, bindingResult);
    }
}
