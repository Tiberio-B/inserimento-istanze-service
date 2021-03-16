package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.*;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends Dto {

    @NotEmpty(message = Messages.qualitaRichiedente)
    private String qualitaRichiedente;

    @Valid
    @NotNull(message = Messages.richiedente)
    private SoggettoDto richiedente;

    @Valid
    private DepositoDto datiDeposito;

    @Valid
    @NotNull(message = Messages.categoriaDeposito)
    private String categoriaDeposito;

    @Valid
    @NotNull(message = Messages.tipoIstanza)
    private String tipoIstanza;

    @Valid
    private RichiestaDto datiRichiesta;
    @Valid
    private ProtocolloDto datiProtocollo;

    @Valid
    private RtsDto rtsInoltro;

    private String stato;

    @Valid
    private Set<DocumentoDto> allegati;

}
