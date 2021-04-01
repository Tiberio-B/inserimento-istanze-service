package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CassaDto extends ModalitaPagamentoDto {

    private String tesoreria;
    private String causale;
}
