package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.SvildepDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends SvildepDto {

    private Boolean inserimentoManuale;

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;

    @Positive(message = Messages.erroreGenerico)
    private String categoriaDepositoId;

    private String tipoId;

    private CoinvolgimentoSoggettoDto richiedente;

    private String statoId;

    private String qualitaRichiedenteId;
}
