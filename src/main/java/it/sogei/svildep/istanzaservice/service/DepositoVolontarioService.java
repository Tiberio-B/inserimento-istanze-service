package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoVolontarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoVolontarioService extends IstanzaService<DepositoVolontarioDto> {

    private final DepositoVolontarioMapper mapper;
}
