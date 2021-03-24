package it.sogei.svildep.istanzaservice.dto.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VagliaDto extends ModalitaPagamentoDto {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private IndirizzoDto indirizzo;
}
