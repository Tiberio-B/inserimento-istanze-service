package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoGiudiziarioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto autoritaOrdinante;
    private SoggettoDto soggettoUlteriore;

    public DepositoGiudiziarioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_GIUDIZIARIO");
        if (getQualitaRichiedente().equals("ME_MEDESIMO")) this.versante = getRichiedente();
    }
}
