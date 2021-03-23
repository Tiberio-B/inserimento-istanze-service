package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.gestioneutenti.Ruolo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StatoDeposito extends BaseEntity {

    private Long idStatoDeposito;
    private String descrizioneStatoDeposito;
    private Ruolo ruolo;
}
