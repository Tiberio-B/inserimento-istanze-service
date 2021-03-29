package it.sogei.svildep.istanzaservice.mapper.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.SoggettoRicercaDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import it.sogei.svildep.istanzaservice.mapper.IndirizzoMapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@NoArgsConstructor
public abstract class SoggettoRicercaMapper<S extends Soggetto, D extends SoggettoRicercaDto> implements DtoToEntityMapper<S, D> {

    @Autowired private IndirizzoMapper indirizzoMapper;

    public D daSoggettoADto(S entity, D dto) {
        dto.setCodiceFiscale(entity.getCodiceFiscale());
        return dto;
    }

    public S daDtoASoggetto(D dto, S entity) throws RuntimeException {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        return entity;
    }

    public S mapSoggettoRicercaDto(SoggettoRicercaDto dto, S entity) {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        return entity;
    }
}
