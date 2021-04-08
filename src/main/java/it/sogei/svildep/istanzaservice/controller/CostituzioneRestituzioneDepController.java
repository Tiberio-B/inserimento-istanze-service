package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.istanzaservice.service.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restituzioneDeposito")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneRestituzioneDepController extends CostituzioneDepositoController<CostituzioneRestituzioneDepDto> {

    private final CostituzioneDepositoService<CostituzioneRestituzioneDepDto> service;

    private final CostituzioneDepositoValidator<CostituzioneRestituzioneDepDto> validator;

}
