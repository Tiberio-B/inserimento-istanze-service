package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.ricerca.IstanzaRicercaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IstanzaRicercaService<D extends IstanzaRicercaDto> extends IstanzaService {

    private final IstanzaRicercaMapper<D> istanzaRicercaMapper;

    public List<IstanzaTrovataDto> cerca(D istanzaRicercaDto) throws SvildepException {
        List<Object> entities = istanzaRicercaMapper.mapDtoToEntities(istanzaRicercaDto);
        return istanzaRicercaMapper.mapEntitiesToDto(getPersistenceService().searchIstanze(entities));
    }

}
