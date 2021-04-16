package it.sogei.svildep.controller;

import it.sogei.svildep.dto.istanza.CostituzioneDepositoDto;
import it.sogei.svildep.service.CostituzioneDepositoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depositoAmministrativoNoEsproprio")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDepAmministrativoNoEsproprioController extends CostituzioneDepositoController<CostituzioneDepositoDto> {

    private final CostituzioneDepositoService<CostituzioneDepositoDto> service;

}
