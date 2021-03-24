package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.RecapitoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SoggettoDto extends Dto {

    private String cf;
    private List<IndirizzoDto> indirizzi;
    private RecapitoDto recapito;
    private String nonIdentificato;

}
