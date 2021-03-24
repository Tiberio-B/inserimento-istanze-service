package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.SoggettoFisicoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class InserimentoIstanzaDto extends IstanzaDto {

    @NotBlank(message = Messages.modalitaTrasmissione)
    private String modalitaTrasmissione;

    @NotEmpty(message = Messages.qualitaRichiedente)
    private String qualitaRichiedente;

    @NotNull(message = Messages.richiedente)
    private SoggettoFisicoDto richiedente;

    @NotBlank(message = Messages.numeroRichiesta)
    private String numeroRichiesta;

    @NotBlank(message = Messages.dataRichiesta)
    private String dataRichiesta;

    @NotBlank(message = Messages.numeroProtocollo)
    private String numeroProtocollo;

    @NotBlank(message = Messages.dataProtocollo)
    private String dataProcollo;

    @NotBlank(message = Messages.causaleDeposito)
    private String causaleDeposito;

    @NotBlank(message = Messages.importoDeposito)
    private String importoDeposito;

    @NotNull(message = Messages.categoriaDeposito)
    private String categoriaDeposito;

    @NotNull(message = Messages.tipoIstanza)
    private String tipoIstanza;

    @NotBlank(message = Messages.idRTSInoltro)
    private String idRTSInoltro;

    private List<byte[]> allegati;

}
