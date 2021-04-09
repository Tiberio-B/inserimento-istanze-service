package it.sogei.svildep.istanzaservice.entity.gestioneistanze;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import it.sogei.svildep.istanzaservice.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_PROPRIETARI_CATASTALI")
public class ProprietarioCatastale extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PROPRIETARIO_CATASTALE")
    private Long id;
    @Column(name = "DESC_NOMINATIVO_PROPRIETARIO_CATASTALE")
    private String nominativo;
    @Column(name = "CODI_CF_PIVA")
    private String cfPiva;
    @Column(name = "FLAG_SOGGETTO_IRREPERIBILE_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN soggettoIrreperibile;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_SOGGETTO_PROPRIETARI_CATASTALI")
    private TipoSoggetto tipoSoggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_FASCICOLI_PROPRIETARI_CATASTALI")
    private Fascicolo documentoRelataNotifica;

}
