package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DittaIndividualeDto {

    private String denominazioneDitta;
    private String partitaIva;
    private String comuneSede;
    private String provinciaSede;
}
