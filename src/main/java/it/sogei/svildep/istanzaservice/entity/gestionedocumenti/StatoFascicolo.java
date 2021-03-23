package it.sogei.svildep.istanzaservice.entity.gestionedocumenti;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StatoFascicolo extends BaseEntity {

    private Long idStatiFascicolo;
    private String descrizioneStatoFascicolo;
}
