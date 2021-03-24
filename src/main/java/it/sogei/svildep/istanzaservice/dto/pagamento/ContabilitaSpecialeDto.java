package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContabilitaSpecialeDto extends ModalitaPagamentoDto {

    private String sezioneTesoreria;
    private String codiceContabilita;
    private String numeroProvvedimento;
    private String dataProvvedimento;
    private String enteSvincolante;
    private String tipoEnteSvincolante;
    private String associazioneEsistente;
}
