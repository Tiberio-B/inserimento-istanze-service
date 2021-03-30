package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Regione;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Opera extends BaseEntity {

    private Long id;
    private String descrizione;
    private Regione regione;
}
