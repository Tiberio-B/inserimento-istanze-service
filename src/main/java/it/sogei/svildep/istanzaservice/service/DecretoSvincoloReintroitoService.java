package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DecretoSvincoloReintroitoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DecretoSvincoloReintroitoService extends IstanzaService<DecretoSvincoloReintroitoDto> {

    private final DecretoSvincoloReintroitoMapper mapper;
}
