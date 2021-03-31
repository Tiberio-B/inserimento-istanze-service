package it.sogei.svildep.istanzaservice.controller.inserimento;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.inserimento.IstanzaInserimentoService;
import it.sogei.svildep.istanzaservice.validator.inserimento.IstanzaInserimentoValidator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
@NoArgsConstructor
@Getter
@Setter
public abstract class IstanzaInserimentoController<D extends IstanzaInserimentoDto> {

    ResponseEntity<MessageDto> insert(D requestDto, BindingResult bindingResult) throws SvildepException {
        getValidator().validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        requestDto.setInserimentoManuale(true);
        return ResponseEntity.status(HttpStatus.CREATED).body(getService().insert(requestDto));
    }

    public abstract IstanzaInserimentoService<D> getService();

    public abstract IstanzaInserimentoValidator<D> getValidator();

}
