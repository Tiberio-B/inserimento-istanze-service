package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoGiuridicoRicercaDto;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.IstanzaRicercaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class IstanzaSoggettoGiuridicoRicercaService extends IstanzaRicercaService<IstanzaSoggettoGiuridicoRicercaDto> {

    private final IstanzaRicercaMapper<IstanzaSoggettoGiuridicoRicercaDto> mapper;

}
