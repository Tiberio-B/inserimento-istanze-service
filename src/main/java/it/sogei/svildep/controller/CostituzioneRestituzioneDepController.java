package it.sogei.svildep.controller;

import it.sogei.svildep.dto.istanza.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.service.CostituzioneDepositoService;
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

}
