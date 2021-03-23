package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSessoMF;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SoggettoFisico extends BaseEntity {

    private Long idSoggettoFisico;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private FlagSessoMF flagSessoMF;
    private Soggetto soggetto;
    private SoggettoGiuridico soggettoGiuridico;
}
