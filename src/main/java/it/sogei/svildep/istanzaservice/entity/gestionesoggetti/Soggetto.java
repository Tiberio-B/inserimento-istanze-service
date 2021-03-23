package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Soggetto extends BaseEntity {

    private Long idSoggetto;
    private String codiceFiscale;
    private FlagSN flagCertificatoAtSN;
    private TipoSoggetto tipoSoggetto;
}
