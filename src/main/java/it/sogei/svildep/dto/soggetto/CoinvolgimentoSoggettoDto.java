package it.sogei.svildep.dto.soggetto;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.validation.annotation.ParsableLong;
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
