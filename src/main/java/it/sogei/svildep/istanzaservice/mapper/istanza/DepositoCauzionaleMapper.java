package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.DirittoSoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoCauzionaleDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepositoCauzionaleMapper extends InserimentoIstanzaMapper<Istanza, DepositoCauzionaleDtoInserimento> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public DepositoCauzionaleDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoCauzionaleDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoCauzionaleDtoInserimento());
        dto.setProprietario(dirittoSoggettoMapper.mapEntityToDto(new DirittoSoggetto()));
        dto.setEnteCauzionato(dirittoSoggettoMapper.mapEntityToDto(new DirittoSoggetto()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoCauzionaleDtoInserimento dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        DirittoSoggetto proprietario = dirittoSoggettoMapper.mapDtoToEntity(dto.getProprietario());
        DirittoSoggetto
        return null;
    }
}
