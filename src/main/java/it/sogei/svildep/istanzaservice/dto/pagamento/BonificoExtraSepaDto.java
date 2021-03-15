package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonificoExtraSepaDto extends Dto {

    private String descrizioneBanca;
    private String nomeAgenzia;
    private String swiftCode;
    private String numeroConto;
}
