package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CoinvolgimentoSoggettoDto extends SvildepDto {

    @ParsableLong
    private String soggettoId;

    @ParsableLong
    private String tipoCoinvolgimentoSoggettoId;
}
