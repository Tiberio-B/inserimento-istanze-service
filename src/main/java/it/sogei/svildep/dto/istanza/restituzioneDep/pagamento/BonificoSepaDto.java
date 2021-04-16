package it.sogei.svildep.dto.istanza.restituzioneDep.pagamento;

import it.sogei.svildep.dto.geo.StatoEsteroDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonificoSepaDto extends ModalitaPagamentoDto {

    private StatoEsteroDto paeseAreaSepa;
    private String iban;
}
