package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

import java.math.BigDecimal;

@Component
public class RestituzioneDepositoMapper extends IstanzaMapper<RestituzioneDepositoDto> {

    @Override
    public Istanza mapDtoToEntityImpl(RestituzioneDepositoDto dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        try {
            entity.setImportoRichiesto(NumberUtils.parseNumber(dto.getImportoRichiesto(), BigDecimal.class));
            // entity.setModalitaPagamento(dto.getModalitaPagamentoId());
        } catch (Exception ex) {
            throw new SvildepException(ex.getMessage());
        }
        entity.setSoggettiObbligatori(super.getSoggettoMapper().mapDtoToEntity(dto.getSoggettiObbligatori()));
        entity.setIntestatario(super.getSoggettoMapper().mapDtoToEntity(dto.getIntestatario()));
        entity.setPagamentoASoggettiDeposito(Boolean.parseBoolean(dto.getPagamentoASoggettiDeposito()));
        return entity;
    }

    @Override
    public RestituzioneDepositoDto mapEntityToDtoImpl(Istanza entity) {
        RestituzioneDepositoDto dto = super.fromIstanzaToDto(entity, new RestituzioneDepositoDto());
        dto.setImportoRichiesto(entity.getImportoRichiesto().toString());
        // dto.setModalitaPagamentoId(entity.getModalitaPagamento().getId().toString());
        dto.setSoggettiObbligatori(super.getSoggettoMapper().mapEntityToDto(entity.getSoggettiObbligatori()));
        dto.setIntestatario(super.getSoggettoMapper().mapEntityToDto(entity.getIntestatario()));
        dto.setPagamentoASoggettiDeposito(entity.getPagamentoASoggettiDeposito().toString());
        return dto;
    }
}
