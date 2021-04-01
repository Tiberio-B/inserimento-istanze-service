package it.sogei.svildep.istanzaservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CoinvolgimentoSoggettoDto extends SvildepDto {

    private String soggettoId;

    private String tipoCoinvolgimentoSoggettoId;
}
