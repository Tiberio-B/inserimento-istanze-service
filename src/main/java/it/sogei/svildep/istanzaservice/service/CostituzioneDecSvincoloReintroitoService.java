package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
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
