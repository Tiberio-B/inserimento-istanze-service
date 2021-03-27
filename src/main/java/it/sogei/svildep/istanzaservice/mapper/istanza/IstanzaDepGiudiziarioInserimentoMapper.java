package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepGiudiziarioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;

public class IstanzaDepGiudiziarioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepGiudiziarioInserimentoDto> {

    @Override
    public IstanzaDepGiudiziarioInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepGiudiziarioInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepGiudiziarioInserimentoDto());
        // TO-DO
        return null;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepGiudiziarioInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
