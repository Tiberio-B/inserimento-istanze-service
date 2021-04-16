package it.sogei.svildep.controller;

import it.sogei.svildep.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.service.CostituzioneDepositoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("decretoSvincoloReintroito")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDecSvincoloReintroitoController extends CostituzioneDepositoController<CostituzioneDecSvincoloReintroitoDto> {

    private final CostituzioneDepositoService<CostituzioneDecSvincoloReintroitoDto> service;

}
