package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
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

    private final CostituzioneDepositoValidator<CostituzioneDecSvincoloReintroitoDto> validator;

}
