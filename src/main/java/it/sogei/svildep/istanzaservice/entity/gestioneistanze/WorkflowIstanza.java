package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import it.sogei.svildep.istanzaservice.entity.gestioneutenti.Utente;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WorkflowIstanza extends BaseEntity {

    private Long id;
    private StatoIstanza statoIstanza;
    private Utente utente;
    private Deposito deposito;
}
