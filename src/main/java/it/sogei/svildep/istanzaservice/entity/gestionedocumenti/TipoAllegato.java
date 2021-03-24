package it.sogei.svildep.istanzaservice.entity.gestionedocumenti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoAllegato extends BaseEntity {

    private Long id;
    private String descrizioneTipoAllegato;
}
