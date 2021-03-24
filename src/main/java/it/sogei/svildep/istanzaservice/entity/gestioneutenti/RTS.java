package it.sogei.svildep.istanzaservice.entity.gestioneutenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Comune;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RTS extends BaseEntity {

    private Long id;
    private String denominazioneRTS;
    private String telefono;
    private String PEC;
    private Comune comune;
}
