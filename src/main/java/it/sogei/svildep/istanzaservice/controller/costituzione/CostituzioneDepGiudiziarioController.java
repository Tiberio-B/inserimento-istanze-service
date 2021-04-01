package it.sogei.svildep.istanzaservice.controller.costituzione;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.costituzione.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validator.costituzione.CostituzioneDepositoValidator;
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
@RequestMapping("depositoGiudiziario")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDepGiudiziarioController extends CostituzioneDepositoController<CostituzioneDepGiudiziarioDto> {

    private final CostituzioneDepositoService<CostituzioneDepGiudiziarioDto> service;

    private final CostituzioneDepositoValidator<CostituzioneDepGiudiziarioDto> validator;

    @PostMapping
    public ResponseEntity<MessageDto> post(@Valid @RequestBody CostituzioneDepGiudiziarioDto requestDto, BindingResult bindingResult)
            throws SvildepException { return insert(requestDto, bindingResult); }

}
