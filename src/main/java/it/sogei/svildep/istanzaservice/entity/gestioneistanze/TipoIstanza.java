package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoIstanza extends BaseEntity {

    private Long idTipoIstanza;
    private String descrizioneTipoIstanza;
}
