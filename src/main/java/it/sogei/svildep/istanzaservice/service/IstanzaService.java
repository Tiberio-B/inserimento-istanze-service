package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaInserimentoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaInserimentoMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaRicercaMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaTrovataMapper;
import it.sogei.svildep.istanzaservice.service.external.ExternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IstanzaService<D extends IstanzaInserimentoDto> extends ExternalService {

    private final IstanzaMapper<IstanzaDto> istanzaMapper;
    private final IstanzaInserimentoMapper<D> istanzaInserimentoMapper;
    private final IstanzaRicercaMapper istanzaRicercaMapper;
    private final IstanzaTrovataMapper istanzaTrovataMapper;

    public List<IstanzaDto> getAll() {
        List<Istanza> istanze = getRestTemplate().exchange(getURL(), HttpMethod.GET, null, List.class).getBody();
        return istanzaMapper.mapEntityToDto(istanze);
    }

    public IstanzaDto get(Long id) {
        Istanza entity = getRestTemplate().exchange(getURL(), HttpMethod.GET, new HttpEntity<>(id), Istanza.class).getBody();
        return istanzaMapper.daIstanzaADto(entity, new IstanzaDto());
    }

    public MessageDto insert(D istanzaDtoInserimento) throws SvildepException {
        Istanza entity = istanzaInserimentoMapper.mapDtoToEntity(istanzaDtoInserimento);
        return getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(entity), MessageDto.class).getBody();
    }

    public List<IstanzaTrovataDto> cerca(IstanzaRicercaDto istanzaRicercaDto) throws SvildepException {
        Istanza entity = istanzaRicercaMapper.mapDtoToEntity(istanzaRicercaDto);
        List<Istanza> istanze = getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(entity), List.class).getBody();
        return istanzaTrovataMapper.mapEntityToDto(istanze);
    }

    @Override
    protected String getURL() {
        return null;
    }
}
