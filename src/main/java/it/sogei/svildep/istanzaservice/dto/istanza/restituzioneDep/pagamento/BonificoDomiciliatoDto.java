package it.sogei.svildep.istanzaservice.dto.istanza.restituzioneDep.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonificoDomiciliatoDto extends ModalitaPagamentoDto {

    private String abi;
    private String cab;
}
