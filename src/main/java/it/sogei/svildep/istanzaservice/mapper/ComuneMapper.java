package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.ComuneDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComuneMapper implements Mapper<Comune, ComuneDto> {

    @Override
    public ComuneDto mapEntityToDtoImpl(Comune entity) {
        ComuneDto dto = new ComuneDto();
        dto.setNome(entity.getNome());
        return dto;
    }

    @Override
    public Comune mapDtoToEntityImpl(ComuneDto dto) {
        Comune entity = new Comune();
        entity.setNome(dto.getNome());
        return entity;
    }
}