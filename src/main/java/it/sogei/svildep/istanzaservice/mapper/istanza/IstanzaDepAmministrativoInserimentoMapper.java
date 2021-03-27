package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IstanzaDepAmministrativoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepAmministrativoInserimentoDto> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public IstanzaDepAmministrativoInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepAmministrativoInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepAmministrativoInserimentoDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepAmministrativoInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
