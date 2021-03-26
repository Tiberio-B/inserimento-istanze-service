package it.sogei.svildep.istanzaservice.service.external;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SoggettoService extends ExternalService {

    SoggettoService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/soggetto"; }

}
