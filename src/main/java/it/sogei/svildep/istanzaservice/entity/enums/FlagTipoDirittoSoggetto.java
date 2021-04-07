package it.sogei.svildep.istanzaservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoDirittoSoggetto {

    DSP("Proprietario"),
    DSV("Versante");

    public String descrizione;
}
