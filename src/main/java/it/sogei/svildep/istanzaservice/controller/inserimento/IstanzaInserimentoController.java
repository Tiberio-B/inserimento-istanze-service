package it.sogei.svildep.istanzaservice.controller.inserimento;

import it.sogei.svildep.istanzaservice.controller.SvildepController;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaInserimentoService;
import it.sogei.svildep.istanzaservice.validator.inserimento.IstanzaInserimentoValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
@NoArgsConstructor
@Getter
public abstract class IstanzaInserimentoController<D extends IstanzaInserimentoDto> implements SvildepController {

    @Autowired private IstanzaInserimentoService<D> service;
    @Autowired private IstanzaInserimentoValidator<D> validator;

    ResponseEntity<MessageDto> insert(D requestDto, BindingResult bindingResult) throws SvildepException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(requestDto));
    }

}
