package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depositoGiudiziario")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDepGiudiziarioController extends CostituzioneDepositoController<CostituzioneDepGiudiziarioDto> {

    private final CostituzioneDepositoService<CostituzioneDepGiudiziarioDto> service;

    private final CostituzioneDepositoValidator<CostituzioneDepGiudiziarioDto> validator;


}
