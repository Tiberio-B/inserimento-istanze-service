package it.sogei.svildep.controller;

import it.sogei.svildep.dto.istanza.depGiudiziario.CostituzioneDepGiudiziarioDto;
import it.sogei.svildep.service.CostituzioneDepositoService;
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

}
