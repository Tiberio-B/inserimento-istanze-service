package it.sogei.svildep.istanzaservice.controller.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.costituzione.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
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
public class CostituzioneDepCauzionaleController extends CostituzioneDepositoController<CostituzioneDepositoDto> {

    private final CostituzioneDepositoService<CostituzioneDepositoDto> service;

    private final CostituzioneDepositoValidator<CostituzioneDepositoDto> validator;


}
