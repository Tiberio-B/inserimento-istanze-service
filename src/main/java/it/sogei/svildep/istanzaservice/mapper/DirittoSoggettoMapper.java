package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

public class DirittoSoggettoMapper implements Mapper<DirittoSoggetto, DirittoSoggettoDto> {

    @Override
    public DirittoSoggettoDto mapEntityToDtoImpl(DirittoSoggetto entity) {
        DirittoSoggettoDto dto = new DirittoSoggettoDto();
        dto.setSoggettoId(String.valueOf(entity.getSoggetto().getId()));
        dto.setTipoDirittoSoggettoId(String.valueOf(entity.getTipoCoinvolgimentoSoggetto().getId()));
        return dto;
    }

    @Override
    public DirittoSoggetto mapDtoToEntityImpl(DirittoSoggettoDto dto) throws SvildepException {
        DirittoSoggetto entity = new DirittoSoggetto();
        Soggetto soggetto = new Soggetto();
        soggetto.setId(Long.parseLong(dto.getSoggettoId()));
        entity.setSoggetto(soggetto);

        TipoCoinvolgimentoSoggetto tipoCoinvolgimentoSoggetto = new TipoCoinvolgimentoSoggetto();
        tipoCoinvolgimentoSoggetto.setId(Long.parseLong(dto.getTipoDirittoSoggettoId()));

        entity.setTipoCoinvolgimentoSoggetto(tipoCoinvolgimentoSoggetto);
        return entity;
    }
}
