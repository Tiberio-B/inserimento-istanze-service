package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

import java.math.BigDecimal;

@Component
public class DepositoMapper implements Mapper<Deposito, DepositoDto> {

    @Override
    public DepositoDto convertEntityToDtoImpl(Deposito entity) {
        DepositoDto dto = new DepositoDto();
        dto.setCausale(entity.getCausale());
        dto.setImporto(String.valueOf(entity.getImporto()));
        return dto;
    }

    @Override
    public Deposito convertDtoToEntityImpl(DepositoDto dto) {
        Deposito entity = new Deposito();
        entity.setCausale(dto.getCausale());
        entity.setImporto(NumberUtils.parseNumber(dto.getImporto(), BigDecimal.class));
        return entity;
    }
}