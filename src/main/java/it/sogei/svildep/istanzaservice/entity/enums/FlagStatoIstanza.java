package it.sogei.svildep.istanzaservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FlagStatoIstanza {

    SIB("In bozza"),
    SII("Inoltrata");

    public String descrizione;
}
