package it.sogei.svildep.service.external;

import it.sogei.svildep.dto.MessageDto;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.exception.SvildepException;
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
        restTemplate.exchange(URL, HttpMethod.POST, new HttpEntity<>(datoCatastale), MessageDto.class).getBody();
    }

}
