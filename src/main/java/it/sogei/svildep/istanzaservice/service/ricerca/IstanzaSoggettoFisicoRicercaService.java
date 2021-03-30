package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.IstanzaRicercaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class IstanzaSoggettoFisicoRicercaService extends IstanzaRicercaService<IstanzaSoggettoFisicoRicercaDto> {

    private final IstanzaRicercaMapper<IstanzaSoggettoFisicoRicercaDto> mapper;

}
