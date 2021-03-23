package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.MockDataLoader;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EntitaService extends ExternalService {

    EntitaService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    String getURL() { return "http://localhost:8080/svildep/api/istanze"; }

    /*public MessageDto inserimentoIstanzaMock(IstanzaDto dto) throws SvildepException {
        MessageDto response;
        response =  getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(dto) MessageDto.class).getBody();
        MockDataLoader.databaseIstanze.put(String.valueOf(dto), dto);
        response = MessageDto.inserito();
        if (response.isError()) throw new SvildepException(response);
        return response;
    }*/

}
