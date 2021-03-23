package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Provincia;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.geo.ComuneMapper;
import it.sogei.svildep.istanzaservice.mapper.geo.NazioneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IndirizzoMapper implements Mapper<Indirizzo, IndirizzoDto> {

    private final NazioneMapper nazioneMapper;
    private final ComuneMapper comuneMapper;

    @Override
    public IndirizzoDto mapEntityToDtoImpl(Indirizzo entity) {
        IndirizzoDto dto = new IndirizzoDto();
        dto.setNazione(nazioneMapper.mapEntityToDto(entity.getNazione()));
        dto.setProvincia(entity.getProvincia().toString());
        dto.setComune(comuneMapper.mapEntityToDto(entity.getComune()));
        dto.setCap(entity.getCap());
        dto.setIndirizzo(entity.getIndirizzo());
        dto.setCivico(entity.getCivico());
        return dto;
    }

    @Override
    public Indirizzo mapDtoToEntityImpl(IndirizzoDto dto) throws IllegalArgumentException, SvildepException {
        Indirizzo entity = new Indirizzo();

        String provincia = dto.getProvincia();
        entity.setProvincia(provincia != null? Provincia.valueOf(provincia) : null);

        entity.setNazione(nazioneMapper.mapDtoToEntity(dto.getNazione()));
        entity.setComune(comuneMapper.mapDtoToEntity(dto.getComune()));

        entity.setCap(dto.getCap());
        entity.setIndirizzo(dto.getIndirizzo());
        entity.setCivico(dto.getCivico());
        return entity;
    }
}
