package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaturaGiuridicaDto extends SvildepDto {

    private String dataInizioValidita;
    private String dataFineValidita;
    private String denominazioneNaturaGiuridica;
    private String chiusura;
}
