package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaCostDepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaDepositoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.InserimentoIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.ListaRicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.validator.InserimentoIstanzaValidator;
import it.sogei.svildep.istanzaservice.validator.IstanzaValidator;
import it.sogei.svildep.istanzaservice.validator.RicercaIstanzaValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("istanza")
@RequiredArgsConstructor
public class IstanzaController {

    @Autowired private final IstanzaService service;

    @Autowired private RicercaIstanzaValidator ricercaIstanzaValidator;
    @Autowired private InserimentoIstanzaValidator inserimentoIstanzaValidator;

    @GetMapping("{id}")
    public ResponseEntity<DettaglioIstanzaDepositoDto> dettaglio(@PathVariable Long id) throws SvildepException {
        return ResponseEntity.ok().body(service.get(id));
    }

    public ResponseEntity<MessageDto> insert(InserimentoIstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        validate(inserimentoIstanzaValidator, requestDto, bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

    @PostMapping("ricerca")
    public ResponseEntity<List<ListaRicercaIstanzaDto>> cerca(@Valid  @RequestBody RicercaIstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        validate(ricercaIstanzaValidator, requestDto, bindingResult);
        return ResponseEntity.ok().body(service.cerca(requestDto));
    }

    private void validate(IstanzaValidator validator, IstanzaDto requestDto, BindingResult bindingResult) throws BindingException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

}
