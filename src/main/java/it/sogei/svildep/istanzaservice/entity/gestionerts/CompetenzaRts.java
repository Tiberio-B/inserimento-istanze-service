package it.sogei.svildep.istanzaservice.entity.gestionerts;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Provincia;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_REL_COMPETENZE_RTS")
public class CompetenzaRts extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_REL_COMPETENZA_RTS")
    private Long id;

    @Column(name = "DATA_INIZIO")
    private LocalDate dataInizio;
    @Column(name = "DATA_FINE")
    private LocalDate dataFine;

    @ManyToOne
    @JoinColumn(name = "FK1_PROVINCE_COMPETENZE_RTS")
    private Provincia provincia;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_COMPETENZE_RTS")
    private RTS rts;
}
