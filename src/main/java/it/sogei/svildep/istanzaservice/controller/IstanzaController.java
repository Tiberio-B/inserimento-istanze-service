package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("istanza")
@RequiredArgsConstructor
public class IstanzaController {

    private final IstanzaService service;

    private void validate(BindingResult bindingResult) throws BindingException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

    private ResponseEntity<IstanzaDto> insert(IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
        service.prepareInsert(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

    @PostMapping("depositoAmministrativo")
    public ResponseEntity<IstanzaDto> insertDepositoAmministrativo(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("depositoAmministrativoNoEsproprio")
    public ResponseEntity<IstanzaDto> insertDepositoAmministrativoNoEsproprio(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("depositoCauzionale")
    public ResponseEntity<IstanzaDto> insertDepositoCauzionale(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("depositoGiudiziario")
    public ResponseEntity<IstanzaDto> insertDepositoGiudiziario(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("depositoVolontario")
    public ResponseEntity<IstanzaDto> insertDepositoVolontario(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("restituzioneDeposito")
    public ResponseEntity<IstanzaDto> insertRestituzioneDeposito(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @PostMapping("decretoSvincoloReintroito")
    public ResponseEntity<IstanzaDto> insertDecretoSvincoloReintroito(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return insert(requestDto, bindingResult);
    }

    @GetMapping
    public ResponseEntity<List<IstanzaDto>> list() throws SvildepException {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<IstanzaDto> get(@PathVariable Long id) throws SvildepException {
        IstanzaDto dto = service.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    @PutMapping
    public ResponseEntity<Dto> update(@Valid @RequestBody IstanzaDto requestDto, BindingResult bindingResult) throws SvildepException {
        validate(bindingResult);
        boolean created = service.update(requestDto);
        return ResponseEntity.status(created? HttpStatus.CREATED : HttpStatus.OK).body(requestDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Dto> delete(@PathVariable Long id) throws SvildepException {
        Dto dto = service.delete(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}
