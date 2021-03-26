package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaDepCauzionaleInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepositoCauzionaleInserimentoMapper extends IstanzaInserimentoMapper<IstanzaDepCauzionaleInserimentoDto> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public IstanzaDepCauzionaleInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDepCauzionaleInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaDepCauzionaleInserimentoDto());
        dto.setProprietario(dirittoSoggettoMapper.mapEntityToDto(new DirittoSoggetto()));
        dto.setEnteCauzionato(dirittoSoggettoMapper.mapEntityToDto(new DirittoSoggetto()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDepCauzionaleInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        DirittoSoggetto proprietario = dirittoSoggettoMapper.mapDtoToEntity(dto.getProprietario());
        // TO-DO
        return entity;
    }
}
