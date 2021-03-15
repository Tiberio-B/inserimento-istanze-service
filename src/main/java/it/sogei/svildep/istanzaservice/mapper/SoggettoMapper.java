package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoMapper implements Mapper<Soggetto, SoggettoDto> {

    private final DocumentoMapper documentoMapper;
    private final IndirizzoMapper indirizzoMapper;

    @Override
    public SoggettoDto mapEntityToDtoImpl(Soggetto entity) {
        SoggettoDto dto = new SoggettoDto();
        dto.setNome(entity.getNome());
        dto.setCognome(entity.getCognome());
        dto.setCf(entity.getCf());
        dto.setPartitaIva(entity.getPartitaIva());
        dto.setIrreperibile(String.valueOf(entity.getIrreperibile()));
        dto.setRelataNotificaSoggettoNonReperibile(documentoMapper.mapEntityToDto(entity.getRelataNotificaSoggettoNonReperibile()));
        dto.setTipoSoggetto(entity.getTipoSoggetto().toString());
        dto.setCategoriaSoggetto(entity.getCategoriaSoggetto().toString());
        dto.setSesso(entity.getSesso().toString());
        dto.setNasctia(indirizzoMapper.mapEntityToDto(entity.getNascita()));
        return dto;
    }

    @Override
    public Soggetto mapDtoToEntityImpl(SoggettoDto dto) throws SvildepException {
        Soggetto entity = new Soggetto();
        entity.setNascita(indirizzoMapper.mapDtoToEntity(dto.getNasctia()));
        entity.setRelataNotificaSoggettoNonReperibile(documentoMapper.mapDtoToEntity(dto.getRelataNotificaSoggettoNonReperibile()));

        String tipoSoggetto = dto.getTipoSoggetto();
        entity.setTipoSoggetto(tipoSoggetto != null? Soggetto.Tipologia.valueOf(tipoSoggetto) : null);

        String categoriaSoggetto = dto.getCategoriaSoggetto();
        entity.setCategoriaSoggetto(categoriaSoggetto != null? Soggetto.Categoria.valueOf(categoriaSoggetto) : null);

        String sesso = dto.getSesso();
        entity.setSesso(sesso != null? Soggetto.Sesso.valueOf(sesso) : null);

        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setCf(dto.getCf());
        entity.setPartitaIva(dto.getPartitaIva());
        entity.setIrreperibile(Boolean.valueOf(dto.getIrreperibile()));
        return entity;
    }
}
