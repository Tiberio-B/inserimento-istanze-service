package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoDto extends Dto {

    private String soggettoNonIdentificato;

    private String cf;
    private String nome;
    private String cognome;
    private String partitaIva;

    private String tipo;
    private String categoria;
    private String sesso;

    private String irreperibile;
    private DocumentoDto relataNotificaSoggettoNonReperibile;
    

    private IndirizzoDto nascita;

    public enum Tipo {
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
