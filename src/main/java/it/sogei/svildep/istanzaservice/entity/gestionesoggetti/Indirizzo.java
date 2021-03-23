package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Indirizzo extends BaseEntity {

    private Long idIndirizzo;
    private String civico;
    private String indirizzo;
    private String cap;
    private String dettaglio;
    private String ripartizione;
    private TipoIndirizzo tipoIndirizzo;
    private Soggetto soggetto;
    private Comune comune;
    private StatoEstero statoEstero;
}
