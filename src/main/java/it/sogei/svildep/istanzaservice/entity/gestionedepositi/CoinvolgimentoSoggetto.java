package it.sogei.svildep.istanzaservice.entity.gestionedepositi;

import it.sogei.svildep.istanzaservice.entity.base.BaseEntity;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.TipoCoinvolgimentoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CoinvolgimentoSoggetto extends BaseEntity {

    private Long id;
    private TipoCoinvolgimentoSoggetto tipoCoinvolgimentoSoggetto;
    private Soggetto soggetto;
    private Istanza istanza;
}
