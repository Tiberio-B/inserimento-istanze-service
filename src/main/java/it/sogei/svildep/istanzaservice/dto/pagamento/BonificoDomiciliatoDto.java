package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.BonificoDomiciliato;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BonificoDomiciliatoDto extends Dto {

    private String abi;
    private String cab;
}
