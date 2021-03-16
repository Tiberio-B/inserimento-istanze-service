package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
@NoArgsConstructor
public class DepositoAmministrativoDto extends IstanzaDto {

    @Valid
    private SoggettoDto depositante;
    @Valid
    private SoggettoDto autoritaEspropriante;

    private String autoritaEsproprianteCoincidenteConDepositante;

    @Valid
    private OperaDto datiOpera;
    @Valid
    private BeneDto beneEspropriato;
}
