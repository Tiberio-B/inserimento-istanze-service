package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerSoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.ricerca.RicercaIstanzaService;
import it.sogei.svildep.istanzaservice.validator.ricerca.RicercaIstanzaValidator;
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
public class RicercaIstanzaPerSoggettoFisicoController extends RicercaIstanzaController<RicercaIstanzaPerSoggettoFisicoDto> {

    private final RicercaIstanzaValidator<RicercaIstanzaPerSoggettoFisicoDto> validator;
    private final RicercaIstanzaService<RicercaIstanzaPerSoggettoFisicoDto> service;

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody RicercaIstanzaPerSoggettoFisicoDto requestDto, BindingResult bindingResult) throws SvildepException {
        return search(requestDto, bindingResult);
    }

}
