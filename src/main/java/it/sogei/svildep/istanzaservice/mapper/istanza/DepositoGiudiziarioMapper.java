package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoGiudiziarioDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.enums.FlagTipoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.TipoDirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.istanzaservice.entity.gestionesoggetti.TipoSoggetto;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

public class DepositoGiudiziarioMapper extends InserimentoIstanzaMapper<Istanza, DepositoGiudiziarioDtoInserimento> {

    @Override
    public DepositoGiudiziarioDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoGiudiziarioDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoGiudiziarioDtoInserimento());
        dto.setVersanteId(String.valueOf(entity.getDepositanteLegale().getId()));
        dto.setAutoritaOrdinanteId(String.valueOf(entity.get));
        return null;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoGiudiziarioDtoInserimento dto) throws SvildepException {
        DirittoSoggetto ds = new DirittoSoggetto();


        ds.setIstanza(entity);
        Soggetto s = new Soggetto();
        s.setId(dto.getSoggettoUlterioreId());
        TipoDirittoSoggetto
        s.setTipoDirittoSoggetto();
        ds.setSoggetto(s);

        dto.getAutoritaOrdinanteId()
                nw"Autoen"


        dto.getSoggettoUlterioreId()

        dto.
        return null;
    }
}
