package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DepositoDto extends Dto {

    @NotBlank(message = Messages.causaleDeposito)
    private String causale;

    @NotBlank(message = Messages.importoDeposito)
    private String importo;

    @Valid
    @NotNull(message = Messages.categoriaDeposito)
    private String categoria;

    public enum Categoria {

        AMMINISTRATIVO,
        AMMINISTRATIVO_NO_ESPROPRIO,
        CAUZIONALE,
        GIUDIZIARIO,
        VOLONTARIO;
    }
}
