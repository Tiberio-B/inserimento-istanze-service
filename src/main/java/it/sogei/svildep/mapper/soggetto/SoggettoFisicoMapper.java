package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.SoggettoFisicoDto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.mapper.geo.NascitaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoFisicoMapper extends SoggettoMapper<Soggetto, SoggettoFisicoDto> {

    private final NascitaMapper nascitaMapper;

    /*@Override
    public SoggettoFisicoDto mapEntityToDtoImpl(SoggettoFisico entity) {
        SoggettoFisicoDto dto = super.daSoggettoADto(entity, new SoggettoFisicoDto());
        dto.setCognome(entity.getCognome());
        dto.setNome(entity.getNome());
        dto.setDataNascita(String.valueOf(entity.getDataNascita()));
        nascitaMapper.daSoggettoFisicoANascitaDto(entity);
        return dto;
    }

    @Override
    public SoggettoFisico mapDtoToEntityImpl(SoggettoFisicoDto dto) throws RuntimeException {
        SoggettoFisico entity = super.daDtoASoggetto(dto, new SoggettoFisico());
        entity.setCognome(dto.getCognome());
        entity.setNome(dto.getNome());
        entity.setDataNascita(LocalDate.parse(dto.getDataNascita()));
        return entity;
    }*/

    @Override
    public SoggettoFisicoDto mapEntityToDtoImpl(Soggetto entity) {
        return null;
    }

    @Override
    public Soggetto mapDtoToEntityImpl(SoggettoFisicoDto dto) throws RuntimeException {
        return null;
    }
}


