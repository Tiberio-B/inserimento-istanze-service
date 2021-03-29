package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.controller.SvildepController;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaRicercaService;
import it.sogei.svildep.istanzaservice.validator.ricerca.IstanzaRicercaValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Component
@NoArgsConstructor
@Getter
public abstract class IstanzaRicercaController<D extends IstanzaRicercaDto> implements SvildepController {

    @Autowired private IstanzaRicercaValidator<D> validator;
    @Autowired private IstanzaRicercaService<D> service;

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> search(@Valid @RequestBody D requestDto, BindingResult bindingResult) throws SvildepException {
        getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(service.cerca(requestDto));
    }

}
