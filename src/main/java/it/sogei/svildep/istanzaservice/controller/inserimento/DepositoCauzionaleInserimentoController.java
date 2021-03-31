package it.sogei.svildep.istanzaservice.controller.inserimento;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoNoEsproprioInserimentoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepCauzionaleInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.inserimento.IstanzaInserimentoService;
import it.sogei.svildep.istanzaservice.validator.inserimento.IstanzaInserimentoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoCauzionale")
@RequiredArgsConstructor
@Getter
@Setter
public class DepositoCauzionaleInserimentoController extends IstanzaInserimentoController<IstanzaDepCauzionaleInserimentoDto> {

    private final IstanzaInserimentoService<IstanzaDepCauzionaleInserimentoDto> service;

    private final IstanzaInserimentoValidator<IstanzaDepCauzionaleInserimentoDto> validator;

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody IstanzaDepCauzionaleInserimentoDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
