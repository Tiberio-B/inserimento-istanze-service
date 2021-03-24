package it.sogei.svildep.istanzaservice.entity.gestioneincameramenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.RTS;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Incameramento extends BaseEntity {

    private Long id;
    private String numeroProtocolloRichiestaIncameramento;
    private LocalDate dataProtocolloRichiestaIncameramento;
    private Double importoDaIncamerare;
    private Deposito deposito;
    private RTS rts;
    private DirittoSoggetto dirittoSoggetto;
    private StatoIncameramento statoIncameramento;
}
