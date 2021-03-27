package it.sogei.svildep.istanzaservice.mapper.soggetto;

import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSessoMF;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.NascitaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class SoggettoFisicoMapper extends SoggettoMapper<SoggettoFisico, SoggettoFisicoDto> {

    private final NascitaMapper nascitaMapper;

    @Override
    public SoggettoFisicoDto mapEntityToDtoImpl(SoggettoFisico entity) {
        SoggettoFisicoDto dto = super.daSoggettoADto(entity, new SoggettoFisicoDto());
        dto.setCognome(entity.getCognome());
        dto.setNome(entity.getNome());
        dto.setSesso(String.valueOf(entity.getSesso()));
        dto.setDataNascita(String.valueOf(entity.getDataNascita()));
        nascitaMapper.daSoggettoFisicoANascitaDto(entity);
        return dto;
    }

    @Override
    public SoggettoFisico mapDtoToEntityImpl(SoggettoFisicoDto dto) throws SvildepException {
        SoggettoFisico entity = super.daDtoASoggetto(dto, new SoggettoFisico());
        entity.setCognome(dto.getCognome());
        entity.setNome(dto.getNome());
        entity.setSesso(FlagSessoMF.valueOf(dto.getSesso()));
        entity.setDataNascita(LocalDate.parse(dto.getDataNascita()));
        nascitaMapper.daNascitaDtoASoggettoFisico(dto.getLuogoNascita(), entity);
        return entity;
    }



}


