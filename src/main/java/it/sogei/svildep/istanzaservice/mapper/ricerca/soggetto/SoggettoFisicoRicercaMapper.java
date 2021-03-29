package it.sogei.svildep.istanzaservice.mapper.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoFisicoRicercaDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.SoggettoFisico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class SoggettoFisicoRicercaMapper extends SoggettoRicercaMapper<SoggettoFisico, SoggettoFisicoRicercaDto> {

    public SoggettoFisico mapSoggettoRicercaDto(SoggettoFisicoRicercaDto dto) {
        SoggettoFisico entity = new SoggettoFisico();

        entity.setCodiceFiscale(dto.getCodiceFiscale());
        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());

        String dataNascita = dto.getDataNascita();
        if (dataNascita != null) entity.setDataNascita(LocalDate.parse(dataNascita));

        return entity;
    }

    @Override
    public SoggettoFisico mapDtoToEntityImpl(SoggettoFisicoRicercaDto dto) throws RuntimeException {
        SoggettoFisico entity = super.daDtoASoggetto(dto, new SoggettoFisico());
        entity.setCognome(dto.getCognome());
        entity.setNome(dto.getNome());
        entity.setDataNascita(LocalDate.parse(dto.getDataNascita()));
        return entity;
    }
}


