package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoCauzionaleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoCauzionaleService extends IstanzaService<DepositoCauzionaleDto> {

    private final DepositoCauzionaleMapper mapper;
}
