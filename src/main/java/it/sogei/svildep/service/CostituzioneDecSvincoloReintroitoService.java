package it.sogei.svildep.service;

import it.sogei.svildep.dto.istanza.decSvincoloReintroito.CostituzioneDecSvincoloReintroitoDto;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDecSvincoloReintroitoService extends CostituzioneDepositoService<CostituzioneDecSvincoloReintroitoDto> {

    private final CostituzioneDepositoMapper<CostituzioneDecSvincoloReintroitoDto> istanzaMapper;

}
