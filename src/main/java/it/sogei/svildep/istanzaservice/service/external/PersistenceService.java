package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.util.JsonOperation;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
public class PersistenceService implements ExternalService {

    private final RestTemplate restTemplate;

    @Value("${persistence-service-url}")
    private String URL;

    @Value("${persistence-service-istanze-path}")
    private String PATH_ISTANZE;

    public Istanza getIstanza(Long id) {
        return restTemplate.exchange(URL+PATH_ISTANZE, HttpMethod.GET, new HttpEntity<>(id), Istanza.class).getBody();
    }

    public MessageDto insertIstanza(Istanza istanza, ArrayList<CoinvolgimentoSoggetto> coinvolgimenti) throws SvildepException {
        String json1 = JsonOperation.objectToJson(istanza);
        String json2 = JsonOperation.objectToJson(coinvolgimenti);
        HttpEntity<String[]> json = new HttpEntity<>(new String[]{json1, json2});
        return restTemplate.exchange(URL+PATH_ISTANZE, HttpMethod.POST, json, MessageDto.class).getBody();
    }

    public List<Istanza> getAllIstanze() {
        return restTemplate.exchange(URL+PATH_ISTANZE, HttpMethod.GET, null, List.class).getBody();
    }

    public List<Istanza> searchIstanze(List<Object> entities) {
        return restTemplate.exchange(URL+PATH_ISTANZE, HttpMethod.POST, new HttpEntity<>(entities), List .class).getBody();
    }

}
