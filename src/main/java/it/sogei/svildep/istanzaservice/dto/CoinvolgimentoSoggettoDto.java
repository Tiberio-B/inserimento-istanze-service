package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
public class CoinvolgimentoSoggettoDto extends SvildepDto {

    @Positive(message = Messages.erroreGenerico)
    private String soggettoId;

    @Positive(message = Messages.erroreGenerico)
    private String tipoCoinvolgimentoSoggettoId;
}
