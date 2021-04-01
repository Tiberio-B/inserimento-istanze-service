package it.sogei.svildep.istanzaservice.mapper.ricerca.soggetto;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.soggetto.RicercaSoggettoDto;
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
public abstract class RicercaSoggettoMapper<S extends Soggetto, D extends RicercaSoggettoDto> implements DtoToEntityMapper<S, D> {

    @Autowired private IndirizzoMapper indirizzoMapper;

    public D daSoggettoADto(S entity, D dto) {
        dto.setCodiceFiscale(entity.getCodiceFiscale());
        return dto;
    }

    public S daDtoASoggetto(D dto, S entity) throws RuntimeException {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        return entity;
    }

    public S mapSoggettoRicercaDto(RicercaSoggettoDto dto, S entity) {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        return entity;
    }
}
