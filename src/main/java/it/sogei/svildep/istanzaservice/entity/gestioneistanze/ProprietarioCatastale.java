package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProprietarioCatastale extends BaseEntity {

    private Long id;
    private String nominativo;
    private String cfPiva;
    private TipoSoggetto tipoSoggetto;
    private boolean soggettoIrreperibile;
    private Fascicolo documentoRelataNotifica;
}
