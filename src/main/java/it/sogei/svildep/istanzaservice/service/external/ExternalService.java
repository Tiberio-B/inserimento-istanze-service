package it.sogei.svildep.istanzaservice.service.external;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Getter
@NoArgsConstructor
public abstract class ExternalService {

    @Autowired private RestTemplate restTemplate;

    ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected abstract String getURL();
}
