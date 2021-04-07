package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Regione;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_OPERE")
public class Opera extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_OPERA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_OPERA")
    private String descrizione;
    @ManyToOne
    @JoinColumn(name = "FK1_REGIONI_OPERE")
    private Regione regione;
}
