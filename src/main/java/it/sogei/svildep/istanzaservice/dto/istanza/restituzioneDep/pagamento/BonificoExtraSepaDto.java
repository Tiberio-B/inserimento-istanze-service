package it.sogei.svildep.istanzaservice.dto.istanza.restituzioneDep.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonificoExtraSepaDto extends ModalitaPagamentoDto {

    private String descrizioneBanca;
    private String nomeAgenzia;
    private String swiftCode;
    private String numeroConto;
}
