package it.sogei.svildep.istanzaservice.dto.istanza.depGiudiziario;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;

import javax.validation.constraints.NotBlank;

public class SoggettoUlterioreDto extends SvildepDto {

    @NotBlank(message = Messages.erroreNome)
    private String nome;

    @NotBlank(message = Messages.erroreCognome)
    private String cognome;
    private String cfPiva;
}
