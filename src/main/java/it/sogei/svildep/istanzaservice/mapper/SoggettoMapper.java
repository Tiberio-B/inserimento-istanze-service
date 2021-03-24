package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.IndirizzoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoOldDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DittaIndividualeDto;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SoggettoMapper implements Mapper<Soggetto, SoggettoDto> {

    private final DocumentoMapper documentoMapper;
    private final IndirizzoMapper indirizzoMapper;

    @Override
    public SoggettoDto mapEntityToDtoImpl(Soggetto entity) {
        SoggettoDto dto = null;
        switch (entity.getTipoSoggetto().getDescrizioneTipoSoggetto()) {
            case F:
                dto = new SoggettoFisicoDto();
                break;
            case G:
                dto = new SoggettoGiuridicoDto();
                break;
            case D:
                dto = new DittaIndividualeDto();
                break;
            default:
                dto = new SoggettoDto();
                break;
        }
        dto.setCf(entity.getCodiceFiscale());
        dto.setIndirizzi(indirizzoMapper.mapEntityToDto(entity.getIndirizzi()));
        dto.setTipo

        private Long id;
        private String codiceFiscale;
        private FlagSN certificatoAnagrafeTributaria;
        private TipoSoggetto tipoSoggetto;
        private List<Indirizzo> indirizzi;

        dto.setTipoSoggetto(entity.getTipoSoggetto().toString());

        dto.setNome(entity.getNome());
        dto.setCognome(entity.getCognome());

        dto.setPartitaIva(entity.getPartitaIva());
        dto.setIrreperibile(String.valueOf(entity.getIrreperibile()));
        dto.setRelataNotificaSoggettoNonReperibile(documentoMapper.mapEntityToDto(entity.getRelataNotificaSoggettoNonReperibile()));

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
