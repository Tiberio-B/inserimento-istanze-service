package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaPerSoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.RicercaIstanzaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerSoggettoGiuridicoService extends RicercaIstanzaService<RicercaIstanzaPerSoggettoGiuridicoDto> {

    private final RicercaIstanzaMapper<RicercaIstanzaPerSoggettoGiuridicoDto> mapper;

}
