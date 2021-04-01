package it.sogei.svildep.istanzaservice.service.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDecSvincoloReintroitoService extends CostituzioneDepositoService<CostituzioneDecSvincoloReintroitoDto> {

    private final CostituzioneDepositoMapper<CostituzioneDecSvincoloReintroitoDto> istanzaMapper;

}
