package it.sogei.svildep.istanzaservice.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlagTipoCoinvolgimento {

    A("Autorità ordinante"),
    B("Presunto beneficiario"),
    I("Soggetto da individuare");

    public String descrizione;
}
