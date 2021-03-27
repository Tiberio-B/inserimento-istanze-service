package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepAmministrativoNoEsproprioInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IstanzaDepAmministrativoNoEsproprioInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepAmministrativoNoEsproprioInserimentoDto> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public IstanzaDepAmministrativoNoEsproprioInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepAmministrativoNoEsproprioInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepAmministrativoNoEsproprioInserimentoDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepAmministrativoNoEsproprioInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
