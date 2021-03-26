package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends Dto {

    private String numeroRichiesta;
    private String dataRichiesta;

    private String numeroProtocollo;
    private String dataProtocollo;

    private String importoDeposito;
    private String causaleDeposito;
    private String categoriaDepositoId;

    private String tipoId;

    private DirittoSoggettoDto richiedente;

    private String statoId;

}
