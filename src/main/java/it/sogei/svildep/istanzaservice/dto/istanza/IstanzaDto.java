package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class IstanzaDto extends Dto {

    @NotBlank
    private String qualitaRichiedente;

    @NotNull
    private SoggettoDto richiedente;

    private DepositoDto datiDeposito;
    private String categoriaDeposito;

    private RichiestaDto datiRichiesta;
    private ProtocolloDto datiProtocollo;

    private RtsDto rtsInoltro;

    private String stato;

    private Set<DocumentoDto> allegati;

}
