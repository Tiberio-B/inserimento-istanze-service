package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepVolontarioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

public class IstanzaDepVolontarioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepVolontarioInserimentoDto> {

    @Override
    public IstanzaDepVolontarioInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepVolontarioInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepVolontarioInserimentoDto());
        // TO-DO
        return null;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepVolontarioInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
