package it.sogei.svildep.istanzaservice.service.external;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersistenceService extends ExternalService {

    PersistenceService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/istanze"; }

    /*public MessageDto inserimentoIstanzaMock(IstanzaInserimentoDto dto) throws SvildepException {
        MessageDto response;
        response =  getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(dto) MessageDto.class).getBody();
        MockDataLoader.databaseIstanze.put(String.valueOf(dto), dto);
        response = MessageDto.inserito();
        if (response.isError()) throw new SvildepException(response);
        return response;
    }*/

}