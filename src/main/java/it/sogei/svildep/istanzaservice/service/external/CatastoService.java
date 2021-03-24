package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatastoService extends ExternalService {

    CatastoService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/catasto"; }

    public MessageDto verificaDatiCatastoMock(CatastoDto dto) throws SvildepException {
        MessageDto response;
        // response =  getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(dto), MessageDto.class).getBody();
        response = new MessageDto("OK", HttpStatus.OK);
        if (response.isError()) throw new SvildepException(response);
        return response;
    }

}
