package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostDepAmministrativiEsproprioDto extends DettaglioIstanzaDepositoDto{

    private String generalContractor;
    private DirittoSoggettoDto depositanteLegale;
    private DirittoSoggettoDto autoritaEspropriante;
    private String operaId;
    private String beneEspropriatoId;
}
