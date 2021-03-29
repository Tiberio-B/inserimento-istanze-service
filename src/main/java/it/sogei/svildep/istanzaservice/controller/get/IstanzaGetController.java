package it.sogei.svildep.istanzaservice.controller.get;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaGetService;
import it.sogei.svildep.istanzaservice.validator.ricerca.IstanzaRicercaValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("istanze")
@RequiredArgsConstructor
public class IstanzaGetController {

    private final IstanzaGetService service;

    @GetMapping
    public ResponseEntity<List<IstanzaDto>> lista() { return ResponseEntity.ok().body(service.getAll()); }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDto> dettaglio(@PathVariable String id) throws SvildepException {
        Long idIstanza;
        try { idIstanza = Long.parseLong(id); }
        catch (NumberFormatException ex) { throw new SvildepException(Messages.invalidIdMessage, HttpStatus.BAD_REQUEST); }
        return ResponseEntity.ok().body(service.get(idIstanza));
    }

}
