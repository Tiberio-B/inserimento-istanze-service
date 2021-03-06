package it.sogei.svildep.dto.istanza;

import it.sogei.svildep.dto.soggetto.CoinvolgimentoSoggettoDto;
import it.sogei.svildep.exception.Messages;
import it.sogei.svildep.validation.annotation.ParsableDate;
import it.sogei.svildep.validation.annotation.ParsableLong;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CostituzioneDepositoDto extends IstanzaDto {

    @ParsableLong(message = Messages.soggettoRtsCompetenteId)
    private String soggettoRtsCompetenteId;

    @ParsableLong(message = Messages.idRTSInoltro)
    private String rtsInoltroId;

    private List<byte[]> allegati;

    @NotEmpty(message = Messages.erroreTipoCoinvolgimento)
    @Valid
    private List<CoinvolgimentoSoggettoDto> coinvolgimenti;

    @ParsableLong(message = Messages.qualitaRichiedente)
    public String getQualitaRichiedenteId() { return  super.getQualitaRichiedenteId(); }

    @ParsableLong(message = Messages.tipoIstanza)
    public String getTipoId() { return super.getTipoId(); }

    @ParsableLong(message = Messages.numeroRichiesta)
    public String getNumeroRichiesta() { return super.getNumeroRichiesta(); }

    @ParsableDate(message = Messages.dataRichiesta)
    public String getDataRichiesta() { return super.getDataRichiesta(); }

    @ParsableLong(message = Messages.numeroProtocollo)
    public String getNumeroProtocollo() { return super.getNumeroProtocollo(); }

    @ParsableDate(message = Messages.dataProtocollo)
    public String getDataProtocollo() { return super.getDataProtocollo(); }

//    @ParsableDouble(message = Messages.importoDeposito)
    public String getImportoDeposito() { return super.getImportoDeposito(); }

    @NotBlank(message = Messages.causaleDeposito)
    public String getCausaleDeposito() { return super.getCausaleDeposito(); }

}
