package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Deposito;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
public class DepositoDto extends Dto {

    @NotBlank
    private String causale;
    @NotBlank
    private String importo;
}
