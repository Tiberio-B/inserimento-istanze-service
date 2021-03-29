package it.sogei.svildep.istanzaservice.mapper.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoGiuridicoRicercaDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.SoggettoGiuridico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoGiuridicoRicercaMapper extends SoggettoRicercaMapper<SoggettoGiuridico, SoggettoGiuridicoRicercaDto> {

    public SoggettoGiuridico mapSoggettoRicercaDto(SoggettoGiuridicoRicercaDto dto) {
        SoggettoGiuridico entity = new SoggettoGiuridico();
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }

    @Override
    public SoggettoGiuridico mapDtoToEntityImpl(SoggettoGiuridicoRicercaDto dto) throws RuntimeException {
        SoggettoGiuridico entity = super.daDtoASoggetto(dto, new SoggettoGiuridico());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }
}
