package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CassaDto extends ModalitaPagamentoDto {

    private String tesoreria;
    private String causale;
}
