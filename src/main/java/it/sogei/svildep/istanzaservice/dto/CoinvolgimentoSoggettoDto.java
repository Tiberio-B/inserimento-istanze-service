package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import it.sogei.svildep.istanzaservice.validation.annotation.ValidSvildepId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class CoinvolgimentoSoggettoDto extends SvildepDto {

    @ValidSvildepId
    private String soggettoId;

    @ValidSvildepId
    private String tipoCoinvolgimentoSoggettoId;
}
