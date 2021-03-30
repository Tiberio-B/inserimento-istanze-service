package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.ricerca.IstanzaRicercaService;
import it.sogei.svildep.istanzaservice.validator.ricerca.IstanzaRicercaValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("istanze/ricercaPerSoggettoFisico")
@RequiredArgsConstructor
@Getter
public class IstanzaSoggettoFisicoRicercaController extends IstanzaRicercaController<IstanzaSoggettoFisicoRicercaDto> {

    private final IstanzaRicercaValidator<IstanzaSoggettoFisicoRicercaDto> validator;
    private final IstanzaRicercaService<IstanzaSoggettoFisicoRicercaDto> service;

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody IstanzaSoggettoFisicoRicercaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return search(requestDto, bindingResult);
    }

}
