package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.soggetto.SoggettoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import it.sogei.svildep.istanzaservice.mapper.IndirizzoMapper;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@NoArgsConstructor
public abstract class SoggettoMapper<S extends Soggetto, D extends SoggettoDto> implements Mapper<S, D> {

    @Autowired private IndirizzoMapper indirizzoMapper;

    public D daSoggettoADto(S entity, D dto) {
        dto.setCodiceFiscale(entity.getCodiceFiscale());
        dto.setCertificatoAnagrafeTributaria(String.valueOf(entity.getCertificatoAnagrafeTributaria()));
        dto.setTipoSoggetto(String.valueOf(entity.getTipoSoggetto()));
        return dto;
    }

    public S daDtoASoggetto(D dto, S entity) throws RuntimeException {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        entity.setCertificatoAnagrafeTributaria(FlagSN.valueOf(dto.getCertificatoAnagrafeTributaria()));
        // TipoSoggetto tipoSoggetto = new TipoSoggetto(FlagTipoSoggetto.valueOf(dto.getTipoSoggetto())); // grossi dubbi
        // entity.setTipoSoggetto(tipoSoggetto);
        return entity;
    }
}
