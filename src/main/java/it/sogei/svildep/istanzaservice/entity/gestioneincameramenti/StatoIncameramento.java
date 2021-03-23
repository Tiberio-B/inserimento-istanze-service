package it.sogei.svildep.istanzaservice.entity.gestioneincameramenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StatoIncameramento extends BaseEntity {

    private Long idStatoIncameramento;
    private String descrizioneStatoIncameramento;
    private StatoIncameramento statoIncameramento;
}
