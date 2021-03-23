package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DatoCatastale extends BaseEntity {

    private Long idDatoCatastale;
    private String sezioneUrbana;
    private String foglio;
    private String subalterno;
    private String particella;
    private TipoCatasto tipoCatasto;
    private Comune comune;
}
