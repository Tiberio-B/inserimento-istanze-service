package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepGiudiziarioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

public class DepositoGiudiziarioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepGiudiziarioInserimentoDto> {

    @Override
    public IstanzaDepGiudiziarioInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepGiudiziarioInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepGiudiziarioInserimentoDto());
        dto.setVersanteId(String.valueOf(entity.getDepositanteLegale().getId()));
        dto.setAutoritaOrdinanteId(String.valueOf(entity.get));
        return null;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepGiudiziarioInserimentoDto dto) throws SvildepException {
        DirittoSoggetto ds = new DirittoSoggetto();
        // TO-DO
        return null;
    }
}
