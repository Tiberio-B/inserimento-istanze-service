package it.sogei.svildep.istanzaservice.dto.istanza.costituzione;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.Messages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneDepositoDto extends IstanzaDto {

    @NotBlank(message = Messages.idRTSInoltro)
    private String rtsInoltroId;

    private List<byte[]> allegati;

    @NotEmpty(message = Messages.erroreGenerico)
    @Valid
    private List<CoinvolgimentoSoggettoDto> coinvolgimenti;

    @NotBlank(message = Messages.qualitaRichiedente)
    public String getQualitaRichiedenteId() { return  super.getQualitaRichiedenteId(); }

    @NotBlank(message = Messages.numeroRichiesta)
    public String getNumeroRichiesta() { return super.getNumeroRichiesta(); }

    @NotBlank(message = Messages.dataRichiesta)
    public String getDataRichiesta() { return super.getDataRichiesta(); }

    @NotBlank(message = Messages.numeroProtocollo)
    public String getNumeroProtocollo() { return super.getNumeroProtocollo(); }

    @NotBlank(message = Messages.dataProtocollo)
    public String getDataProtocollo() { return super.getDataProtocollo(); }

    @NotBlank(message = Messages.importoDeposito)
    public String getImportoDeposito() { return super.getImportoDeposito(); }

    @NotBlank(message = Messages.causaleDeposito)
    public String getCausaleDeposito() { return super.getCausaleDeposito(); }

    @Positive(message = Messages.tipoIstanza)
    public String getTipoId() { return super.getTipoId(); }

    @NotBlank(message = Messages.richiedente)
    public CoinvolgimentoSoggettoDto getRichiedente() { return super.getRichiedente(); }

}
