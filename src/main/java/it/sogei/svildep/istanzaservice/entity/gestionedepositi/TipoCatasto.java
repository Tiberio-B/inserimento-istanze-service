package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_CATASTO")
public class TipoCatasto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_CATASTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_CATASTO")
    private String descrizioneTipoCatasto;
}
