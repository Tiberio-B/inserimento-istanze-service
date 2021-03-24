package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoIstanza extends BaseEntity {

    private Long id;
    private Tipo descrizioneTipoIstanza;

    public enum Tipo {

        DEPOSITO_CAUZIONALE,
        DEPOSITO_GIUDIZIARIO,
        DEPOSITO_AMMINISTRATIVO,
        DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO,
        DEPOSITO_VOLONTARIO,
        DECRETO_SVINCOLO_REINTROITO,
        RESTITUZIONE_DEPOSITO;
    }

}
