package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Getter
public class DatoCatastaleService implements ExternalService {

    private final RestTemplate restTemplate;

    @Value("${persistence-service-url}")
    private String URL;

    public void verificaDatiCatastali(DatoCatastale datoCatastale) throws SvildepException {
        restTemplate.exchange(URL, HttpMethod.POST, new HttpEntity<DatoCatastale>(datoCatastale), MessageDto.class).getBody();
    }

}
