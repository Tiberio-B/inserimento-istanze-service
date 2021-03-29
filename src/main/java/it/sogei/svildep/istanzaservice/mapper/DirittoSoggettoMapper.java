package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.TipoDirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.Mapper;

public class DirittoSoggettoMapper implements Mapper<DirittoSoggetto, DirittoSoggettoDto> {

    @Override
    public DirittoSoggettoDto mapEntityToDtoImpl(DirittoSoggetto entity) {
        DirittoSoggettoDto dto = new DirittoSoggettoDto();
        dto.setSoggettoId(String.valueOf(entity.getSoggetto().getId()));
        dto.setTipoDirittoSoggettoId(String.valueOf(entity.getTipoDirittoSoggetto().getId()));
        return dto;
    }

    @Override
    public DirittoSoggetto mapDtoToEntityImpl(DirittoSoggettoDto dto) throws SvildepException {
        DirittoSoggetto entity = new DirittoSoggetto();
        Soggetto soggetto = new Soggetto();
        soggetto.setId(Long.parseLong(dto.getSoggettoId()));
        entity.setSoggetto(soggetto);

        TipoDirittoSoggetto tipoDirittoSoggetto = new TipoDirittoSoggetto();
        tipoDirittoSoggetto.setId(Long.parseLong(dto.getTipoDirittoSoggettoId()));

        entity.setTipoDirittoSoggetto(tipoDirittoSoggetto);
        return entity;
    }
}
