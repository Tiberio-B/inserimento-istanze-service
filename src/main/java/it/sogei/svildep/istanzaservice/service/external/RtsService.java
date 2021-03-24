package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class RtsService extends ExternalService {

    RtsService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/rts"; }

    public MessageDto inserimentoInFascicoloMock(Set<DocumentoDto> documenti) throws SvildepException {
        MessageDto response;
        // response =  getRestTemplate().exchange(getURL(), HttpMethod.POST, new HttpEntity<>(documenti), MessageDto.class).getBody();
        response = new MessageDto("OK", HttpStatus.OK);
        if (response.isError()) throw new SvildepException(response);
        return response;
    }

}
