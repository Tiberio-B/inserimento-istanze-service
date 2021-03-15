package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoGiudiziarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoGiudiziarioService extends IstanzaService<DepositoGiudiziarioDto> {

    private final DepositoGiudiziarioMapper mapper;
}
