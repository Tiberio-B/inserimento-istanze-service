package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.IstanzaRestituzioneDepositoInserimentoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IstanzaRestitutizioneDepositoInserimentoMapper extends IstanzaInserimentoMapper<IstanzaRestituzioneDepositoInserimentoDto> {

    private final DirittoSoggettoMapper dirittoSoggettoMapper;

    @Override
    public IstanzaRestituzioneDepositoInserimentoDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaRestituzioneDepositoInserimentoDto dto = super.daIstanzaADto(entity, new IstanzaRestituzioneDepositoInserimentoDto());
        // TO-DO
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaRestituzioneDepositoInserimentoDto dto) throws SvildepException {
        Istanza entity = super.daDtoAIstanza(dto);
        // TO-DO
        return entity;
    }
}
