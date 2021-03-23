package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
public class Provincia extends BaseEntity {

    private Long idProvincia;
    private String denominazioneProvincia;
    private Regione regione;
    private Set<Comune> listaComuni;
}
