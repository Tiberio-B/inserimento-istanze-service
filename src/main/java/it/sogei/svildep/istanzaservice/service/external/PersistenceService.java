package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
public class PersistenceService implements ExternalService {

    private final RestTemplate restTemplate;

    @Override
    public String getURL() { return "http://localhost:8080/svildep/api/persistence"; }

    private String pathIstanze() { return "/istanze"; }

    public Istanza getIstanza(Long id) {
        return restTemplate.exchange(getURL()+pathIstanze(), HttpMethod.GET, new HttpEntity<>(id), Istanza.class).getBody();
    }

    public MessageDto insertIstanza(Istanza entity) {
        return restTemplate.exchange(getURL(), HttpMethod.POST, new HttpEntity<>(entity), MessageDto.class).getBody();
    }

    public List<Istanza> getAllIstanze() {
        return restTemplate.exchange(getURL()+pathIstanze(), HttpMethod.GET, null, List.class).getBody();
    }

    public List<Istanza> searchIstanze(List<Object> entities) {
        return restTemplate.exchange(getURL()+pathIstanze(), HttpMethod.POST, new HttpEntity<>(entities), List .class).getBody();
    }

}
