package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaDepositoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDtoInserimento;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.ListaRicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.DettaglioIstanzaMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.InserimentoIstanzaMapper;
import it.sogei.svildep.istanzaservice.mapper.istanza.RicercaIstanzaMapper;
import it.sogei.svildep.istanzaservice.service.external.ExternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IstanzaService extends ExternalService {

    private final InserimentoIstanzaMapper inserimentoIstanzaMapper;
    private final RicercaIstanzaMapper ricercaIstanzaMapper;
    private final DettaglioIstanzaMapper dettaglioIstanzaMapper;

    public MessageDto insert(IstanzaDtoInserimento istanzaDtoInserimento) throws SvildepException {
        Istanza entity = inserimentoIstanzaMapper.fromDtoToIstanza(istanzaDtoInserimento);
        return getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(entity), MessageDto.class).getBody();
    }

    public List<ListaRicercaIstanzaDto> cerca(RicercaIstanzaDto ricercaIstanzaDto) throws SvildepException {
        Istanza entity = ricercaIstanzaMapper.fromDtoToIstanza(ricercaIstanzaDto);
        return getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(entity), List.class).getBody();
    }

    public DettaglioIstanzaDepositoDto get(Long id) throws SvildepException {
        Istanza entity = getRestTemplate().exchange(getURL(), HttpMethod.GET, new HttpEntity<>(id), Istanza.class).getBody();
        return dettaglioIstanzaMapper.fromIstanzaToDto(entity);
    }

    public List<IstanzaDto> getAll() {
        return getRestTemplate().exchange(getURL(), HttpMethod.GET, null, List.class).getBody();
    }

    @Override
    protected String getURL() {
        return null;
    }
}
