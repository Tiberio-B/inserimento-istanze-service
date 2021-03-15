package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoAmministrativoNoEsproprioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoAmministrativoNoEsproprioService extends IstanzaService<DepositoAmministrativoNoEsproprioDto> {

    private final DepositoAmministrativoNoEsproprioMapper mapper;
}
