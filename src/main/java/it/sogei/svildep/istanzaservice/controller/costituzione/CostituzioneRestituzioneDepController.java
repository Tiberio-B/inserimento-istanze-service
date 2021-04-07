package it.sogei.svildep.istanzaservice.controller.costituzione;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.costituzione.CostituzioneDepositoService;
import it.sogei.svildep.istanzaservice.validation.validator.costituzione.CostituzioneDepositoValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("restituzioneDeposito")
@RequiredArgsConstructor
@Getter
@Setter
public class CostituzioneRestituzioneDepController extends CostituzioneDepositoController<CostituzioneRestituzioneDepDto> {

    private final CostituzioneDepositoService<CostituzioneRestituzioneDepDto> service;

    private final CostituzioneDepositoValidator<CostituzioneRestituzioneDepDto> validator;

}
