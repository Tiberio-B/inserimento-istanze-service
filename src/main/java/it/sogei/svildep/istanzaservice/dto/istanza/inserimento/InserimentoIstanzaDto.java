package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class InserimentoIstanzaDto extends IstanzaDto {

    @NotBlank(message = Messages.numeroRichiesta)
    private String numeroRichiesta;

    @NotBlank(message = Messages.dataRichiesta)
    private String dataRichiesta;

    @NotBlank(message = Messages.numeroProtocollo)
    private String numeroProtocollo;

    @NotBlank(message = Messages.dataProtocollo)
    private String dataProtocollo;

    @NotBlank(message = Messages.importoDeposito)
    private String importoDeposito;

    @NotBlank(message = Messages.causaleDeposito)
    private String causaleDeposito;

    @NotBlank(message = Messages.categoriaDeposito)
    private String categoriaDepositoId;

    @NotBlank(message = Messages.tipoIstanza)
    private String tipoIstanzaId;

    @NotBlank(message = Messages.richiedente)
    private String richiedenteId;

    @NotBlank(message = Messages.idRTSInoltro)
    private String idRTSInoltro;

    private List<byte[]> allegati;

    @NotBlank(message = Messages.modalitaTrasmissione)
    private String modalitaTrasmissione;

    @NotBlank(message = Messages.qualitaRichiedente)
    private String qualitaRichiedente;

    public enum QualitaRichiedente {

        ME_MEDESIMO,
        TITOLARE_RAPPRESENTANTE_LEGALE,
        RESPONSABILE_UFFICIO_PUBBLICO;
    }

}
