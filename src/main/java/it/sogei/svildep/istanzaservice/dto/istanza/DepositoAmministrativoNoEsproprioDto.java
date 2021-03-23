package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoNoEsproprioDto extends IstanzaDto {

    @Valid
    private SoggettoDto versante;
    @Valid
    private SoggettoDto ulterioreSoggetto;

}
