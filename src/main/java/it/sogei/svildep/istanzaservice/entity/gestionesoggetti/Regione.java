package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_REGIONI")
public class Regione extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_REGIONE")
    private Long id;
    @Column(name = "DESC_DENOMINAZIONE_REGIONE")
    private String denominazioneRegione;
    @OneToMany(mappedBy = "regione")
    private Set<Provincia> listaProvince;
}
