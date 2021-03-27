package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDecSvincoloReintroitoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IstanzaDecSvincoloReintroitoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDecSvincoloReintroitoInserimentoDto> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public IstanzaDecSvincoloReintroitoInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDecSvincoloReintroitoInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDecSvincoloReintroitoInserimentoDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDecSvincoloReintroitoInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
