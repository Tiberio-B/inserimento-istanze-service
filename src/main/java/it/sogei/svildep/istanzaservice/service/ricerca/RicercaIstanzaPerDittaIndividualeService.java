package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerDittaIndividualeDto;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.RicercaIstanzaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerDittaIndividualeService extends RicercaIstanzaService<RicercaIstanzaPerDittaIndividualeDto> {

    private final RicercaIstanzaMapper<RicercaIstanzaPerDittaIndividualeDto> mapper;

}
