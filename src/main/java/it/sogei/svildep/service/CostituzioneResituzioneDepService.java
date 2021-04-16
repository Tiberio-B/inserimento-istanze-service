package it.sogei.svildep.service;

import it.sogei.svildep.dto.istanza.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneResituzioneDepService extends CostituzioneDepositoService<CostituzioneRestituzioneDepDto> {

    private final CostituzioneDepositoMapper<CostituzioneRestituzioneDepDto> istanzaMapper;

}
