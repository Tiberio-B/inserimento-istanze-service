package it.sogei.svildep.istanzaservice.mapper.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.RicercaSoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.SoggettoGiuridico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RicercaSoggettoGiuridicoMapper extends RicercaSoggettoMapper<SoggettoGiuridico, RicercaSoggettoGiuridicoDto> {

    public SoggettoGiuridico mapSoggettoRicercaDto(RicercaSoggettoGiuridicoDto dto) {
        SoggettoGiuridico entity = new SoggettoGiuridico();
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }

    @Override
    public SoggettoGiuridico mapDtoToEntityImpl(RicercaSoggettoGiuridicoDto dto) throws RuntimeException {
        SoggettoGiuridico entity = super.daDtoASoggetto(dto, new SoggettoGiuridico());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }
}
