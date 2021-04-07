package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSede;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_SEDE")
public class TipoSede extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_SEDE")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_SEDE")
    private String descrizioneTipoSede;
    @Column(name = "CODI_CODICE_TIPO_SEDE")
    private FlagTipoSede codiceTipoSede;
}
