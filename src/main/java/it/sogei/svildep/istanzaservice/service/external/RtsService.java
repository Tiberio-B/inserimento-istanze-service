package it.sogei.svildep.istanzaservice.service.external;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RtsService extends ExternalService {

    RtsService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/rts"; }

}
