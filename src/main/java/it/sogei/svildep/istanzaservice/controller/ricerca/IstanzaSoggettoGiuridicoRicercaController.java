package it.sogei.svildep.istanzaservice.controller.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaSoggettoGiuridicoRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.validator.ricerca.IstanzaRicercaValidator;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("istanze/ricercaPerSoggettoGiuridico")
public class IstanzaSoggettoGiuridicoRicercaController extends IstanzaRicercaController<IstanzaSoggettoGiuridicoRicercaDto> {

    @PostMapping
    public ResponseEntity<List<IstanzaTrovataDto>> cerca(@Valid @RequestBody IstanzaSoggettoGiuridicoRicercaDto requestDto, BindingResult bindingResult) throws SvildepException {
        return search(requestDto, bindingResult);
    }

}
