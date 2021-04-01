package it.sogei.svildep.istanzaservice.service.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep.CostituzioneRestituzioneDepDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneResituzioneDepService extends CostituzioneDepositoService<CostituzioneRestituzioneDepDto> {

    private final CostituzioneDepositoMapper<CostituzioneRestituzioneDepDto> istanzaMapper;

}
