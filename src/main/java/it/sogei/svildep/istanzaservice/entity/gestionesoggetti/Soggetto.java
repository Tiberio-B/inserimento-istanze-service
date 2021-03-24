package it.sogei.svildep.istanzaservice.entity.gestionesoggetti;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.enums.FlagSN;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Soggetto extends BaseEntity {

    private Long id;
    private String codiceFiscale;
    private FlagSN certificatoAnagrafeTributaria;
    private TipoSoggetto tipoSoggetto;
    private List<Indirizzo> indirizzi;
}
