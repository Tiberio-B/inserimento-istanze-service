package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoUnita extends BaseEntity {

    private Long idTipoUnita;
    private String descrizioneTipoUnita;
}
