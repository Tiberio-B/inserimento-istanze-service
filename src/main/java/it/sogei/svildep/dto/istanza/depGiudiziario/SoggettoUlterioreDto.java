package it.sogei.svildep.dto.istanza.depGiudiziario;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableFlagSN;
import lombok.Getter;

@Getter
public class SoggettoUlterioreDto extends SvildepDto {

    @ParsableFlagSN
    private String soggettoNonIdentificato;

    private String cfPiva;
    private String nome;
    private String cognome;

}
