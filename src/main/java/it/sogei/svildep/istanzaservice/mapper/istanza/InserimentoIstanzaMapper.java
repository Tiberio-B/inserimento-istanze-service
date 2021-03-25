package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.inserimento.InserimentoIstanzaDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.mapper.SoggettoMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Primary
@NoArgsConstructor
public abstract class InserimentoIstanzaMapper<Dto extends InserimentoIstanzaDto> extends IstanzaMapper<Dto> {

    @Getter
    @Autowired private SoggettoMapper soggettoMapper;

    public Dto fromIstanzaToDto(Istanza entity, Dto dto) {
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));
        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));
        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());
        dto.getCategoriaDepositoId(String.valueOf(entity.getCategoriaDeposito().getId());
        dto.getTipoIstanzaId(String.valueOf(entity.getTipoIstanza().getId());
        dto.getRichiedenteId(String.valueOf(entity.getRichiedente().getId());
        return dto;
    }

    public Istanza fromDtoToIstanza(Dto dto) {
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
