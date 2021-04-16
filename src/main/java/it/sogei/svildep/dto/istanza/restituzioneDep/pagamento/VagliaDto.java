package it.sogei.svildep.dto.istanza.restituzioneDep.pagamento;

import it.sogei.svildep.dto.geo.IndirizzoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VagliaDto extends ModalitaPagamentoDto {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private IndirizzoDto indirizzo;
}
