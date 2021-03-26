package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.validator.IstanzaRicercaValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("istanze")
@RequiredArgsConstructor
public class IstanzaController {

    private final IstanzaService<IstanzaInserimentoDto> service;
    private final IstanzaRicercaValidator istanzaRicercaValidator;

    @GetMapping
    public ResponseEntity<List<IstanzaDto>> lista() { return ResponseEntity.ok().body(service.getAll()); }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDto> dettaglio(@PathVariable String idInput) throws SvildepException {
        Long id;
        try { id = Long.parseLong(idInput); }
        catch (NumberFormatException ex) { throw new SvildepException(Messages.invalidIdMessage, HttpStatus.BAD_REQUEST); }
        return ResponseEntity.ok().body(service.get(id));
    }

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody IstanzaRicercaDto requestDto, BindingResult bindingResult) throws SvildepException {
        istanzaRicercaValidator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(service.cerca(requestDto));
    }

}
