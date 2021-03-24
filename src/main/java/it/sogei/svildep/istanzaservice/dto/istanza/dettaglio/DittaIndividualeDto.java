package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DittaIndividualeDto extends SoggettoDto {

    private String denominazioneDitta;
    private String partitaIva;
    private String comuneSede;
    private String provinciaSede;
}
