package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Indirizzo extends BaseEntity {

    private Long id;
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
