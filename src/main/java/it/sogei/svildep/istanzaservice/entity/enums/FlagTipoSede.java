package it.sogei.svildep.istanzaservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoSede {

    TSL("Sede legale"),
    TSU("Unità locale");

    public String descrizione;
}
