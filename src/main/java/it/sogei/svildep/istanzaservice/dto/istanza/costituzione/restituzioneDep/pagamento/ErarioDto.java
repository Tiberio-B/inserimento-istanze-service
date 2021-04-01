package it.sogei.svildep.istanzaservice.dto.istanza.costituzione.restituzioneDep.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErarioDto extends ModalitaPagamentoDto {

    private String indicatore;
    private String sezione;
    private String capoImputazioneEntrata;
    private String capitoloEntrata;
    private String articoloEntrata;
}
