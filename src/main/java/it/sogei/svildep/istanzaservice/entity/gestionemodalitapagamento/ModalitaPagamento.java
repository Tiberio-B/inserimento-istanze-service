package it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ModalitaPagamento extends BaseEntity {

    private Long id;
    private TipoModalitaPagamento tipoModalitaPagamento;
}
