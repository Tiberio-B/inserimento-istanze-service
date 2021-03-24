package it.sogei.svildep.istanzaservice.entity.gestionedocumenti;

import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestioneincameramenti.Incameramento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestionemandati.AccertamentoDM40;
import it.sogei.svildep.istanzaservice.entity.gestionemandati.Mandato;
import it.sogei.svildep.istanzaservice.entity.gestionepignoramenti.Pignoramento;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.RTS;
import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Fascicolo extends BaseEntity {

    private Long id;
    private String descrizioneFile;
    private String estensioneFile;
    private byte[] documentoAllegato;
    private StatoFascicolo statoFascicolo;
    private RTS rts;
    private Deposito deposito;
    private AccertamentoDM40 accertamentoDM40;
    private TipoAllegato tipoAllegato;
    private Istanza istanza;
    private Incameramento incameramento;
    private Pignoramento pignoramento;
    private Mandato mandato;

}
