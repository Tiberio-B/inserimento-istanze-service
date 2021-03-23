package it.sogei.svildep.istanzaservice.dto.istanza.dettaglio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModalitaPagamentoDto {

    private String tesoreriaCassa;
    private String causaleCassa;
    private String destinatarioVaglia;
    private IndirizzoDto esteroVaglia;
    private String paeseBonificoSepa;
    private String ibanBonificaSepa;
    private String descrizioneBancaBonificoExtra;
    private String filialeBonificoExtra;
    private String swiftBonificoExtra;
    private String numeroContoBonificoExtra;
    private String abiBonificoDomiciliato;
    private String cabBonificoDomiciliato;
    private String tesoreriaUnica;
    private String numeroContoTesoreriaUnica;
    private String indicatoreErario;
    private String sezioneErario;
    private String capoImputazioneEntrataErario;
    private String capitoloEntrataErario;
    private String articoloEntrataErario;
    private String sezioneTesoreriaContabilitaSpeciale;
    private String codiceContabilitaSpeciale;
}
