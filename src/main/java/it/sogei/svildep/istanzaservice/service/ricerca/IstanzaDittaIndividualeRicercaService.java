package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.IstanzaDittaIndividualeRicercaDto;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.IstanzaRicercaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class IstanzaDittaIndividualeRicercaService extends IstanzaRicercaService<IstanzaDittaIndividualeRicercaDto> {

    private final IstanzaRicercaMapper<IstanzaDittaIndividualeRicercaDto> mapper;

}
