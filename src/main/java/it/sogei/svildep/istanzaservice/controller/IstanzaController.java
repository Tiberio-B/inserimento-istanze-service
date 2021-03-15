package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.istanza.*;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class IstanzaController<D extends IstanzaDto> {

    @Autowired private IstanzaService<D> service;

    public ResponseEntity<D> insert(D requestDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
        service.prepareInsert(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<D>> list() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<D> get(@PathVariable Long id) {
        D dto = service.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    @PutMapping
    public ResponseEntity<Dto> update(@Valid @RequestBody D requestDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
        boolean created = service.update(requestDto);
        return ResponseEntity.status(created? HttpStatus.CREATED : HttpStatus.OK).body(requestDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Dto> delete(@PathVariable Long id) {
        Dto dto = service.delete(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}
