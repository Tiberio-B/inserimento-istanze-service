package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.DettaglioIstanzaDepCauzionaleDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import it.sogei.svildep.istanzaservice.service.external.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dettaglio")
public class DettaglioIstanzaController extends IstanzaController{

    @Autowired
    private AuthService authService;

    @GetMapping("{id}")
    public ResponseEntity<DettaglioIstanzaDepCauzionaleDto> getIstanzaDepCauzionale(@RequestHeader("authorization") String token, @PathVariable Long id) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.OPERATORE_RTS_ROLE);

        //return get(token,id);
        return null;
    }
}
