package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaSvincoloReintroitoDto {

    private String numeroProvvedimento;
    private String dataProvvedimento;
    private String enteSvincolante;
    private String tipoEnteSvincolante;
    private String checkDecretoEsistente;
}
