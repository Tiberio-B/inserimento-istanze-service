package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.CostituzioneDepAmministrativoDto;
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
