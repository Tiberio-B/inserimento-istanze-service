package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepVolontarioDto extends IstanzaDepositoDto {

    private CoinvolgimentoSoggettoDto propEntePubblico;

}
