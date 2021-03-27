package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DirittoSoggettoMapper implements Mapper<DirittoSoggetto, DirittoSoggettoDto> {

    @Override
    public DirittoSoggettoDto mapEntityToDtoImpl(DirittoSoggetto entity) {
        DirittoSoggettoDto dto = new DirittoSoggettoDto();
        dto.setSoggettoId(String.valueOf(entity.getSoggetto().getId()));
        dto.setTipoDirittoSoggettoId(String.valueOf(entity.getTipoDirittoSoggetto().getId()));
        return dto;
    }

    @Override
    public DirittoSoggetto mapDtoToEntityImpl(DirittoSoggettoDto dto) {
        DirittoSoggetto entity = new DirittoSoggetto();
        Soggetto soggetto = new Soggetto();
        soggetto.setId(Long.parseLong(dto.getSoggettoId()));
        entity.setSoggetto(soggetto);
        return entity;
    }
}
