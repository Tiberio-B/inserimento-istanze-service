package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.*;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoGiuridicoMapper extends SoggettoMapper<SoggettoGiuridico, SoggettoGiuridicoDto> {

    @Override
    public SoggettoGiuridicoDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        SoggettoGiuridicoDto dto = super.daSoggettoADto(entity, new SoggettoGiuridicoDto());
        dto.setRagioneSociale(entity.getRagioneSociale());
        dto.setNaturaGiuridicaId(String.valueOf(entity.getNaturaGiuridica().getId()));
        dto.setCCIAA(entity.getCCIAA());
        dto.setPartitaIva(entity.getPartitaIVA());
        dto.setDenominazioneDitta(entity.getDenominazioneDitta());
        return dto;
    }

    @Override
    public SoggettoGiuridico mapDtoToEntityImpl(SoggettoGiuridicoDto dto) throws SvildepException {
        SoggettoGiuridico entity = super.daDtoASoggetto(dto, new SoggettoGiuridico());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setCCIAA(dto.getCCIAA());
        entity.setPartitaIVA(dto.getPartitaIva());
        entity.setDenominazioneDitta(dto.getDenominazioneDitta());
        return entity;
    }

}
