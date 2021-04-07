package it.sogei.svildep.istanzaservice.entity.gestionemandati;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_ACCERTAMENTO_DM40")
public class TipoAccertamentoDM40 extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_ACCERTAMENTO_DM40")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_ACCERTAMENTO_DM40")
    private String descrizioneTipoAccertamentoDM40;
}
