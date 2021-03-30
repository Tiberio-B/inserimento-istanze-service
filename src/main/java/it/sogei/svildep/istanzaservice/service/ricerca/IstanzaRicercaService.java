package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.inserimento.IstanzaInserimentoMapper;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.IstanzaRicercaMapper;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public abstract class IstanzaRicercaService<D extends IstanzaRicercaDto> extends IstanzaService {

    public List<IstanzaTrovataDto> cerca(D istanzaRicercaDto) throws SvildepException {
        List<Object> entities = getMapper().mapDtoToEntities(istanzaRicercaDto);
        return getMapper().mapEntitiesToDtos(getPersistenceService().searchIstanze(entities));
    }

    public abstract IstanzaRicercaMapper<D> getMapper();

}
