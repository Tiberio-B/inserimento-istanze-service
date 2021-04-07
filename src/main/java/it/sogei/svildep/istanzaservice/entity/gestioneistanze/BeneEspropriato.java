package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DatoCatastale;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_BENI_ESPROPRIATI")
public class BeneEspropriato extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_BENE_ESPROPRIATO")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "FK1_DATI_CATASTALI_BENI_ESPROPRIATI")
    private DatoCatastale datoCatastale;
    @ManyToOne
    @JoinColumn(name = "FK1_PROPRIETARI_CATASTALI_BENI_ESPROPRIATI")
    private ProprietarioCatastale proprietarioCatastale;

}
