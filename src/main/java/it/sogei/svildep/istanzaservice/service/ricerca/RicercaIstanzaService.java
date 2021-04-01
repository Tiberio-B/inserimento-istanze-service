package it.sogei.svildep.istanzaservice.service.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.ricerca.istanza.RicercaIstanzaMapper;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public abstract class RicercaIstanzaService<D extends RicercaIstanzaDto> extends IstanzaService {

    public List<IstanzaTrovataDto> cerca(D istanzaRicercaDto) throws SvildepException {
        List<Object> entities = getMapper().mapDtoToEntities(istanzaRicercaDto);
        return getMapper().mapEntitiesToDtos(getPersistenceService().searchIstanze(entities));
    }

    public abstract RicercaIstanzaMapper<D> getMapper();

}
