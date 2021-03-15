package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RestituzioneDepositoDto extends IstanzaDto {

    private String importoRichiesto;

    private Set<SoggettoDto> soggettiObbligatori;
    private SoggettoDto intestatario;

    private String pagamentoASoggettiDeposito;

    private String modalitaPagamentoId;

    public RestituzioneDepositoDto() {
        super();
        this.setCategoriaDeposito("RESTITUZIONE_DEPOSITO");
    }
}
