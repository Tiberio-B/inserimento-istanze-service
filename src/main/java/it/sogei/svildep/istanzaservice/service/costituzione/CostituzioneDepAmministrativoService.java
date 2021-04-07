package it.sogei.svildep.istanzaservice.service.costituzione;

import it.sogei.svildep.istanzaservice.dto.istanza.costituzione.depAmministrativo.CostituzioneDepAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.CostituzioneDepositoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class CostituzioneDepAmministrativoService extends CostituzioneDepositoService<CostituzioneDepAmministrativoDto> {

    private final CostituzioneDepositoMapper<CostituzioneDepAmministrativoDto> istanzaMapper;



}
