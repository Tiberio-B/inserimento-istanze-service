package it.sogei.svildep.istanzaservice.service.external;

import org.springframework.web.client.RestTemplate;

public interface ExternalService {

    RestTemplate getRestTemplate();

    String getURL();
}
