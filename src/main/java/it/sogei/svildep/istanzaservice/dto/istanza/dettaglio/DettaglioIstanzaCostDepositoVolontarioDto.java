package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.SoggettoGiuridicoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DettaglioIstanzaCostDepositoVolontarioDto extends DettaglioIstanzaDepositoDto{

    private SoggettoGiuridicoDto propEntePubblico;

}
