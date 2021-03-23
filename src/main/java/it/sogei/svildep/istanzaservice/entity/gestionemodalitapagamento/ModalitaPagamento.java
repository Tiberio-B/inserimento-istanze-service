package it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ModalitaPagamento extends BaseEntity {

    private Long idModalitaPagamento;
    private TipoModalitaPagamento tipoModalitaPagamento;
}
