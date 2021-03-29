package it.sogei.svildep.istanzaservice.controller.inserimento;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoNoEsproprioInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("depositoAmministrativoNoEsproprio")
@RequiredArgsConstructor
public class DepositoAmministrativoNoEsproprioInserimentoController extends IstanzaInserimentoController<IstanzaDepAmministrativoNoEsproprioInserimentoDto> {

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody IstanzaDepAmministrativoNoEsproprioInserimentoDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}