package it.sogei.svildep.istanzaservice.controller.inserimento;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepVolontarioInserimentoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaRestituzioneDepositoInserimentoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.inserimento.IstanzaInserimentoService;
import it.sogei.svildep.istanzaservice.validator.inserimento.IstanzaInserimentoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("restituzioneDeposito")
@RequiredArgsConstructor
@Getter
public class RestituzioneDepositoInserimentoController extends IstanzaInserimentoController<IstanzaRestituzioneDepositoInserimentoDto> {

    private final IstanzaInserimentoService<IstanzaRestituzioneDepositoInserimentoDto> service;

    private final IstanzaInserimentoValidator<IstanzaRestituzioneDepositoInserimentoDto> validator;

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody IstanzaRestituzioneDepositoInserimentoDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }
}
