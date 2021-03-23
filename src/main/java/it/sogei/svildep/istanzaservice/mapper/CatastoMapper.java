package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Provincia;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.geo.ComuneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CatastoMapper implements Mapper<Catasto, CatastoDto> {
    
    private final ComuneMapper comuneMapper;

    @Override
    public CatastoDto mapEntityToDtoImpl(Catasto entity) {
        CatastoDto dto = new CatastoDto();
        dto.setTipo(entity.getTipo());
        dto.setSezioneUrbana(entity.getSezioneUrbana());
        dto.setFoglio(entity.getFoglio());
        dto.setSubalterno(entity.getSubalterno());
        dto.setParticella(entity.getParticella());
        dto.setProvincia(entity.getProvincia().toString());
        dto.setComune(comuneMapper.mapEntityToDto(entity.getComune()));
        return dto;
    }

    @Override
    public Catasto mapDtoToEntityImpl(CatastoDto dto) throws IllegalArgumentException, SvildepException {
        Catasto entity = new Catasto();

        String provincia = dto.getProvincia();
        entity.setProvincia(provincia != null? Provincia.valueOf(provincia) : null);

        entity.setComune(comuneMapper.mapDtoToEntity(dto.getComune()));
        entity.setTipo(dto.getTipo());
        entity.setSezioneUrbana(dto.getSezioneUrbana());
        entity.setFoglio(dto.getFoglio());
        entity.setSubalterno(dto.getSubalterno());
        entity.setParticella(dto.getParticella());
        return entity;
    }
}
