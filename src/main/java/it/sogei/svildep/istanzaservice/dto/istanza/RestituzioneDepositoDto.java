package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RestituzioneDepositoDto extends IstanzaDto {

    private String importoRichiesto;

    @Valid
    private Set<SoggettoDto> soggettiObbligatori;
    @Valid
    private SoggettoDto intestatario;

    private String pagamentoASoggettiDeposito;

    private String modalitaPagamentoId;

}
