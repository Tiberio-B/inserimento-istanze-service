package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.geo.ComuneMapper;
import it.sogei.svildep.istanzaservice.model.Catasto;
import it.sogei.svildep.istanzaservice.model.geo.Provincia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CatastoMapper implements Mapper<Catasto, CatastoDto> {
    
    private final ComuneMapper comuneMapper;

    @Override
    public CatastoDto convertEntityToDtoImpl(Catasto entity) {
        CatastoDto dto = new CatastoDto();
        dto.setTipo(entity.getTipo());
        dto.setSezioneUrbana(entity.getSezioneUrbana());
        dto.setFoglio(entity.getFoglio());
        dto.setSubalterno(entity.getSubalterno());
        dto.setParticella(entity.getParticella());
        dto.setProvincia(entity.getProvincia().toString());
        dto.setComune(comuneMapper.convertEntityToDto(entity.getComune()));
        return dto;
    }

    @Override
    public Catasto convertDtoToEntityImpl(CatastoDto dto) throws SvildepException {
        Catasto entity = new Catasto();
        entity.setTipo(dto.getTipo());
        entity.setSezioneUrbana(dto.getSezioneUrbana());
        entity.setFoglio(dto.getFoglio());
        entity.setSubalterno(dto.getSubalterno());
        entity.setParticella(dto.getParticella());
        try {
            entity.setProvincia(Provincia.valueOf(dto.getProvincia()));
        } catch (Exception ex) {
            throw new SvildepException(ex.getMessage());
        }
        entity.setComune(comuneMapper.convertDtoToEntity(dto.getComune()));
        return entity;
    }
}
