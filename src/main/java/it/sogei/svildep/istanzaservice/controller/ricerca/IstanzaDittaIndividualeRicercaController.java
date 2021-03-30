package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.IstanzaDittaIndividualeRicercaDto;
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
@RequestMapping("istanze/ricercaPerDittaIndividuale")
@RequiredArgsConstructor
@Getter
public class IstanzaDittaIndividualeRicercaController extends IstanzaRicercaController<IstanzaDittaIndividualeRicercaDto> {

    private final IstanzaRicercaValidator<IstanzaDittaIndividualeRicercaDto> validator;
    private final IstanzaRicercaService<IstanzaDittaIndividualeRicercaDto> service;

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody IstanzaDittaIndividualeRicercaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return search(requestDto, bindingResult);
    }

}
