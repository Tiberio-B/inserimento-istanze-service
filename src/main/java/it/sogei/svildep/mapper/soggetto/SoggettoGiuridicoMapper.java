package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.SoggettoGiuridicoDto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoGiuridicoMapper extends SoggettoMapper<Soggetto, SoggettoGiuridicoDto> {

    /*@Override
    public SoggettoGiuridicoDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        SoggettoGiuridicoDto dto = super.daSoggettoADto(entity, new SoggettoGiuridicoDto());
        dto.setRagioneSociale(entity.getRagioneSociale());
        dto.setPartitaIva(entity.getPartitaIVA());
        return dto;
    }

    @Override
    public SoggettoGiuridico mapDtoToEntityImpl(SoggettoGiuridicoDto dto) throws RuntimeException {
        SoggettoGiuridico entity = super.daDtoASoggetto(dto, new SoggettoGiuridico());
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }*/

    @Override
    public SoggettoGiuridicoDto mapEntityToDtoImpl(Soggetto entity) {
        return null;
    }

    @Override
    public Soggetto mapDtoToEntityImpl(SoggettoGiuridicoDto dto) throws RuntimeException {
        return null;
    }
}
