package it.sogei.svildep.istanzaservice.service.external;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Getter
public abstract class ExternalService {

    @Autowired private final RestTemplate restTemplate;

    ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    abstract String getURL();
}
