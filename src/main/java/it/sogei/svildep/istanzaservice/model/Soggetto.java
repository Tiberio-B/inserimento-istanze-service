package it.sogei.svildep.istanzaservice.model;

import it.sogei.svildep.istanzaservice.model.geo.Indirizzo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soggetto implements Entity {

    private Long id;

    private String cf;
    private String nome;
    private String cognome;
    private String partitaIva;

    private Tipologia tipoSoggetto;
    private Categoria categoriaSoggetto;

    private Boolean irreperibile;
    private Documento relataNotificaSoggettoNonReperibile;

    private Sesso sesso;
    private Indirizzo nascita;

    public enum Tipologia {
        FISICO,
        GIURIDICO,
        DITTA_INDIVIDUALE;
    }

    public enum Categoria {
        DA_INDIVIDUARE, AUTORITA_ORDINANTE, PRESUNTO_BENEFICIARIO;
    }

    public enum Sesso {
        M, F, X;
    }
}
