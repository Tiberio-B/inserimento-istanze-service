package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StatoIstanza extends BaseEntity {

    private Long id;
    private String descrizione;
    private FlagStatoIstanza codice;
}
