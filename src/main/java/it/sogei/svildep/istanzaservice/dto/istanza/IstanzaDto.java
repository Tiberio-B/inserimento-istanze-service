package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends SvildepDto {

    private Boolean inserimentoManuale;

    private String qualitaRichiedenteId;
    private String tipoId;
    private String statoId;

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;

    private String categoriaDepositoId;

}
