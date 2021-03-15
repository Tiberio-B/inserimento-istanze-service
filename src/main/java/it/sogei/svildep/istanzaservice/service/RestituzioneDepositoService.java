package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.RestituzioneDepositoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestituzioneDepositoService extends IstanzaService<RestituzioneDepositoDto> {

    private final RestituzioneDepositoMapper mapper;

}
