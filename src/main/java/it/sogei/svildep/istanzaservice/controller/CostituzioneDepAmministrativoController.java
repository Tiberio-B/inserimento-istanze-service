package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
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

    private final CostituzioneDepositoValidator<CostituzioneDepAmministrativoDto> validator;

}
