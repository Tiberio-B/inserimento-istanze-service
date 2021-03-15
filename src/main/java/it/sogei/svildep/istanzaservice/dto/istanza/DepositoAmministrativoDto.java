package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.BeneDto;
import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoAmministrativoDto extends IstanzaDto {

    private SoggettoDto depositante;
    private SoggettoDto autoritaEspropriante;

    private String autoritaEsproprianteCoincidenteConDepositante;

    private OperaDto datiOpera;
    private BeneDto beneEspropriato;

    public DepositoAmministrativoDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_AMMINISTRATIVO");
    }
}
