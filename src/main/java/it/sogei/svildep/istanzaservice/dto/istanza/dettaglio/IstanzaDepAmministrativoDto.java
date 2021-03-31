package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepAmministrativoDto extends IstanzaDepositoDto {

    private String generalContractor;
    private CoinvolgimentoSoggettoDto depositanteLegale;
    private CoinvolgimentoSoggettoDto autoritaEspropriante;
    private String operaId;
    private String beneEspropriatoId;
}
