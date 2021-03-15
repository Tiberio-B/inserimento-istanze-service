package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoAmministrativoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoAmministrativoService extends IstanzaService<DepositoAmministrativoDto> {

    private final DepositoAmministrativoMapper mapper;
}
