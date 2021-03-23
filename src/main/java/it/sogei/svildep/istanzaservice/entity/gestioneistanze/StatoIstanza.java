package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.gestioneutenti.Ruolo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StatoIstanza {

    private Long idStatoIstanza;
    private String descrizioneStatoIstanza;
    private Ruolo ruolo;
}
