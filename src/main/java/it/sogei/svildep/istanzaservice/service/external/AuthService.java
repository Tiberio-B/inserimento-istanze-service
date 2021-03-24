package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.UserDto;
import it.sogei.svildep.istanzaservice.exception.AuthorizationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService extends ExternalService {

    AuthService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getURL() { return "http://localhost:8080/svildep/api/auth"; }

    public UserDto ottieniUtenteAutorizzatoMock(String token, Role... requiredRoles) throws AuthorizationException {
        // UserDto userDTO = getRestTemplate().exchange(getURL(), HttpMethod.GET, setRequestAuthorization(token, requiredRoles), UserDto.class).getBody();
        UserDto userDTO = new UserDto("Pippo", "OPERATORE_RTS_ROLE");
        if (userDTO == null) throw new AuthorizationException();
        return userDTO;
    }

    private HttpEntity setRequestAuthorization(String token, Role... requiredRoles){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.set("requiredRoles", Role.toString(requiredRoles));
        return new HttpEntity(headers);
    }

    public enum Role {

        ADMIN_ROLE, OPERATORE_RTS_ROLE;

        public static String toString(Role[] roles) {
            StringBuilder sb = new StringBuilder();
            for (Role role : roles) sb.append(role.name()).append(",");
            return sb.toString();
        }
    }

}
