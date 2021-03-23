package it.sogei.svildep.istanzaservice.entity.gestionemodalitapagamento;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoModalitaPagamento extends BaseEntity {

    private Long idTipoModalitaPagamento;
    private String descrizioneModalitaPagamento;
}
