package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.ricerca.RicercaIstanzaService;
import it.sogei.svildep.istanzaservice.validation.validator.ricerca.RicercaIstanzaValidator;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Component
@NoArgsConstructor
public abstract class RicercaIstanzaController<D extends RicercaIstanzaDto> {

    public ResponseEntity<List<IstanzaTrovataDto>> search(@Valid @RequestBody D requestDto, BindingResult bindingResult) throws SvildepException {
        getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(getService().cerca(requestDto));
    }

    public abstract RicercaIstanzaService<D> getService();

    public abstract RicercaIstanzaValidator<D> getValidator();

}
