package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagStatoIstanza;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_ISTANZA")
public class StatoIstanza extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_ISTANZA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_ISTANZA")
    private String descrizione;
    @Column(name = "CODI_CODICE_STATO_ISTANZA")
    @Enumerated(EnumType.STRING)
    private FlagStatoIstanza codice;
}
