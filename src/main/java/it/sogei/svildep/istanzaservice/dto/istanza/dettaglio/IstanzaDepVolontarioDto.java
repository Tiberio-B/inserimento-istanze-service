package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepVolontarioDto extends IstanzaDepositoDto {

    private DirittoSoggettoDto propEntePubblico;

}
