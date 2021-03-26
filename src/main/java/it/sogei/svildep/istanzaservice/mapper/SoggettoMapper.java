package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
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
        dto.setIndirizzi(indirizzoMapper.mapEntityToDto(entity.getIndirizzi()));
        return dto;
    }

    public S daDtoASoggetto(D dto, S entity) throws SvildepException {
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        entity.setCertificatoAnagrafeTributaria(FlagSN.valueOf(dto.getCertificatoAnagrafeTributaria()));
        TipoSoggetto tipoSoggetto = new TipoSoggetto(FlagTipoSoggetto.valueOf(dto.getTipoSoggetto())); // grossi dubbi
        entity.setTipoSoggetto(tipoSoggetto);
        entity.setIndirizzi(indirizzoMapper.mapDtoToEntity(dto.getIndirizzi()));
        return entity;
    }
}
