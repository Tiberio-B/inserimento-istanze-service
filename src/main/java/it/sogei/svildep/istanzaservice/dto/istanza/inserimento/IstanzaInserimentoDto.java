package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import it.sogei.svildep.istanzaservice.dto.CoinvolgimentoSoggettoDto;
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
public class IstanzaInserimentoDto extends IstanzaDto {

    @NotBlank(message = Messages.idRTSInoltro)
    private String rtsInoltroId;

    private List<byte[]> allegati;

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

    @NotBlank(message = Messages.categoriaDeposito)
    public String getCategoriaDepositoId() { return super.getCategoriaDepositoId(); }

    @NotBlank(message = Messages.tipoIstanza)
    public String getTipoId() { return super.getTipoId(); }

    @NotBlank(message = Messages.richiedente)
    public CoinvolgimentoSoggettoDto getRichiedente() { return super.getRichiedente(); }

}
