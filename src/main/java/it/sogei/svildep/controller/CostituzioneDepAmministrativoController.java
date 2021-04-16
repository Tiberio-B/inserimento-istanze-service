package it.sogei.svildep.controller;

import it.sogei.svildep.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.service.CostituzioneDepositoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depositoAmministrativo")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneDepAmministrativoController extends CostituzioneDepositoController<CostituzioneDepAmministrativoDto> {

    private final CostituzioneDepositoService<CostituzioneDepAmministrativoDto> service;

}
