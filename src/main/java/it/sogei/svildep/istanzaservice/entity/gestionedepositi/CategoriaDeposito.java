package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoriaDeposito extends BaseEntity {

    private Long idCategoria;
    private String descrizioneCategoriaDeposito;
}
