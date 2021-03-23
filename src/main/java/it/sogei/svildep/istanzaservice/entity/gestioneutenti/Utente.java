package it.sogei.svildep.istanzaservice.entity.gestioneutenti;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Utente extends BaseEntity {

    private Long idUtente;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private FlagSN flagAbilitatoSN;
}
