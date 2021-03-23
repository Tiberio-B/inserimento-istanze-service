package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostDepAmministrativiEsproprioDto extends DettaglioIstanzaDepositoDto{

    private String generalContractor;
    private SoggettoGiuridicoDto depositanteLegale;
    private SoggettoGiuridicoDto autoritaEspropriante;
    private String descrizioneOpera;
    private String regione;
    private BeneEspropriatoDto beneEspropriato;
}
