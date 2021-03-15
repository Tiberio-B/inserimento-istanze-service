package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SoggettoService extends ExternalService {

    SoggettoService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    String getURL() { return "http://localhost:8080/svildep/api/soggetto"; }

    public MessageDto verificaSoggettiMock(SoggettoDto... soggetti) throws SvildepException {
        MessageDto response;
        // response =  getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(soggetti), MessageDto.class).getBody();
        response = new MessageDto("OK", HttpStatus.OK);
        if (response.isError()) throw new SvildepException(response);
        return response;
    }

}
