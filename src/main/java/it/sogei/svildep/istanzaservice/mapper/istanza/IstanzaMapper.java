package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<Entity extends Istanza, Dto extends IstanzaDto> implements Mapper<Entity, Dto> {

    Dto fromIstanzaToDto(Istanza entity, Dto dto) {
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));
        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));
        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());

        // dto.setRichiedente(new DirittoSoggettoDto(new SoggettoDto(richiedenteId, new TipoDirittoSoggetto(dirittoSoggetto));

        dto.setCategoriaDepositoId(String.valueOf(entity.getCategoriaDeposito().getId()));
        dto.setTipoId(String.valueOf(entity.getTipo().getId()));
        dto.setStatoId(String.valueOf(entity.getStato().getId()));
        return dto;
    }

    Istanza fromDtoToIstanza(Dto dto) {
        Istanza entity = new Istanza();
        entity.setNumeroRichiesta(Long.parseLong(dto.getNumeroRichiesta()));
        entity.setDataRichiesta(LocalDate.parse(dto.getDataRichiesta()));
        entity.setNumeroProtocollo(Long.parseLong(dto.getNumeroProtocollo()));
        entity.setDataProtocollo(LocalDate.parse(dto.getDataProtocollo()));
        entity.setImportoDeposito(Long.parseLong(dto.getImportoDeposito()));
        entity.setCausaleDeposito(dto.getCausaleDeposito());
        return entity;
    }
}
