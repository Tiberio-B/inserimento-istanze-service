package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.DepositoGiudiziarioDtoInserimento;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import org.springframework.stereotype.Component;

@Component
public class DepositoGiudiziarioMapperInserimento extends InserimentoIstanzaMapper<DepositoGiudiziarioDtoInserimento> {

    @Override
    public DepositoGiudiziarioDtoInserimento mapEntityToDtoImpl(Istanza entity) {
        DepositoGiudiziarioDtoInserimento dto = super.fromIstanzaToDto(entity, new DepositoGiudiziarioDtoInserimento());
        dto.setVersante(getSoggettoMapper().mapEntityToDto(entity.getVersante()));
        dto.setAutoritaOrdinante(getSoggettoMapper().mapEntityToDto(entity.getAutoritaOrdinante()));
        dto.setSoggettoUlteriore(getSoggettoMapper().mapEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public Istanza mapDtoToEntityImpl(DepositoGiudiziarioDtoInserimento dto) throws SvildepException {
        Istanza entity = super.fromDtoToIstanza(dto);
        entity.setVersante(getSoggettoMapper().mapDtoToEntity(dto.getVersante()));
        entity.setAutoritaOrdinante(getSoggettoMapper().mapDtoToEntity(dto.getAutoritaOrdinante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().mapDtoToEntity(dto.getSoggettoUlteriore()));
        return entity;
    }
}
