package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depositoVolontario")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDepVolontarioController extends CostituzioneDepositoController<CostituzioneDepositoDto> {

    private final CostituzioneDepositoService<CostituzioneDepositoDto> service;

    private final CostituzioneDepositoValidator<CostituzioneDepositoDto> validator;

}
