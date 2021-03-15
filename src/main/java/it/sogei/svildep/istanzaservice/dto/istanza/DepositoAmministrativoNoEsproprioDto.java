package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DepositoAmministrativoNoEsproprioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto ulterioreSoggetto;

    public DepositoAmministrativoNoEsproprioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO");
        if (getQualitaRichiedente().equals("ME_MEDESIMO")) this.versante = getRichiedente();
    }
}
