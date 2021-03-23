package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.IndirizzoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.dettaglio.RecapitoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoGiuridicoDto {

    private String cf;
    private String ragioneSociale;
    private String naturaGiuridica;
    private String partitaIva;
    private String cciaa;
    private String progressivoSede;
    private String tipoSede;
    private String denominazione;
    private IndirizzoDto indirizzo;
    private RecapitoDto recapito;

}
