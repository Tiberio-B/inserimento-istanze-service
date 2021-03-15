package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoVolontarioDto extends IstanzaDto {

    private SoggettoDto proprietario;

    public DepositoVolontarioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_VOLONTARIO");
    }
}
