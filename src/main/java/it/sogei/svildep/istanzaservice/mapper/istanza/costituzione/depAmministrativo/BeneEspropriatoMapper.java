package it.sogei.svildep.istanzaservice.mapper.istanza.costituzione.depAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depAmministrativo.BeneEspropriatoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.BeneEspropriato;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.ProprietarioCatastale;
import it.sogei.svildep.istanzaservice.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BeneEspropriatoMapper {

    private final DatoCatastaleMapper datoCatastaleMapper;
    private final ProprietarioCatastaleMapper proprietarioCatastaleMapper;

    public List<BeneEspropriato> mapDtoToEntity(BeneEspropriatoDto dto) throws RuntimeException {
        List<BeneEspropriato> beniEspropriati = new ArrayList<>();
        for (ProprietarioCatastale proprietarioCatastale : proprietarioCatastaleMapper.mapDtoToEntity(dto.getProprietariCatastali())) {
            BeneEspropriato entity = new BeneEspropriato();
            entity.setProprietarioCatastale(proprietarioCatastale);
            entity.setDatoCatastale(datoCatastaleMapper.mapDtoToEntity(dto.getDatiCatastali()));
            beniEspropriati.add(entity);
        }
        return beniEspropriati;
    }
}
