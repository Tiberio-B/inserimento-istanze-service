package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.BeneEspropriatoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.BeneEsprorpiato;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeneEspropriatoMapper implements DtoToEntityMapper<BeneEsprorpiato, BeneEspropriatoDto> {

    private final DatoCatastaleMapper datoCatastaleMapper;
    private final ProprietarioCatastaleMapper proprietarioCatastaleMapper;

    @Override
    public BeneEsprorpiato mapDtoToEntityImpl(BeneEspropriatoDto dto) throws RuntimeException {
        BeneEsprorpiato entity = new BeneEsprorpiato();
        proprietarioCatastaleMapper.mapDtoToEntity(dto.getProprietariCatastali());
        datoCatastaleMapper.mapDtoToEntity(dto.getDatiCatastali());
        return entity;
    }
}
