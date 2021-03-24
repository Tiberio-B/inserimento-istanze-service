package it.sogei.svildep.istanzaservice.entity.gestionemandati;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoMandato extends BaseEntity {

    private Long id;
    private String descrizioneTipoMandato;
}
