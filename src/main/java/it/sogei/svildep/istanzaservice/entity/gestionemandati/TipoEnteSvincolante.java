package it.sogei.svildep.istanzaservice.entity.gestionemandati;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoEnteSvincolante extends BaseEntity {

    private Long id;
    private Long descrizioneTipoEnteSvincolante;
}
