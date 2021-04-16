package it.sogei.svildep.dto.istanza;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.entity.enums.FlagSN;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends SvildepDto {

    private boolean inserimentoManuale;

    private String qualitaRichiedenteId;
    private String tipoId;

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;

    private String categoriaDepositoId;
    private String stato;

}
