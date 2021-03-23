package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Versante extends BaseEntity {

    private Long idVersante;
    private String nome;
    private String cognome;
    private String codiceFiscale;
}
