package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoriaDeposito extends BaseEntity {

    private Long id;
    private Categoria descrizioneCategoriaDeposito;

    public enum Categoria {

        DEPOSITO_CAUZIONALE,
        DEPOSITO_GIUDIZIARIO,
        DEPOSITO_AMMINISTRATIVO,
        DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO,
        DEPOSITO_VOLONTARIO,
        DECRETO_SVINCOLO_REINTROITO,
        RESTITUZIONE_DEPOSITO;
    }
}
