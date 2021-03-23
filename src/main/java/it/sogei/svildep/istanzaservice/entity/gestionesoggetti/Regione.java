package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
public class Regione extends BaseEntity {

    private Long idRegione;
    private String denominazioneRegione;
    private Set<Provincia> listaProvince;
}
