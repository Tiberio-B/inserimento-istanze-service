package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.BeneEspropriatoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.BeneEspropriato;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeneEspropriatoMapper implements DtoToEntityMapper<BeneEspropriato, BeneEspropriatoDto> {

    private final DatoCatastaleMapper datoCatastaleMapper;
    private final ProprietarioCatastaleMapper proprietarioCatastaleMapper;

    @Override
    public BeneEspropriato mapDtoToEntityImpl(BeneEspropriatoDto dto) throws RuntimeException {
        BeneEspropriato entity = new BeneEspropriato();
        proprietarioCatastaleMapper.mapDtoToEntity(dto.getProprietariCatastali());
        datoCatastaleMapper.mapDtoToEntity(dto.getDatiCatastali());
        return entity;
    }
}
