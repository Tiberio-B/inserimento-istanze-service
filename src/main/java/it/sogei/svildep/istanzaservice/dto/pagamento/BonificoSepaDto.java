package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.StatoEsteroDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonificoSepaDto extends ModalitaPagamentoDto {

    private StatoEsteroDto paeseAreaSepa;
    private String iban;
}
