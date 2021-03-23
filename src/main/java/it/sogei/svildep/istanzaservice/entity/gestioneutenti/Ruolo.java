package it.sogei.svildep.istanzaservice.entity.gestioneutenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ruolo extends BaseEntity {

    private Long idRuolo;
    private String ruolo;
}
