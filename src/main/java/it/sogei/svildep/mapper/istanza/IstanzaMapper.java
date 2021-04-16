package it.sogei.svildep.mapper.istanza;

import it.sogei.svildep.dto.istanza.IstanzaDto;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.QualitaRichiedente;
import it.sogei.svildep.entity.gestioneistanze.TipoIstanza;
import it.sogei.svildep.mapper.Mapper;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Primary
@NoArgsConstructor
public class IstanzaMapper implements Mapper<Istanza, IstanzaDto> {

    @Override
    public Istanza mapDtoToEntityImpl(IstanzaDto dto) throws RuntimeException {
        Istanza entity = new Istanza();
        entity.setNumeroRichiesta(Long.parseLong(dto.getNumeroRichiesta()));
        entity.setDataRichiesta(LocalDate.parse(dto.getDataRichiesta()));

        entity.setNumeroProtocollo(Long.parseLong(dto.getNumeroProtocollo()));
        entity.setDataProtocollo(LocalDate.parse(dto.getDataProtocollo()));

        entity.setImportoDeposito(Double.parseDouble(dto.getImportoDeposito()));
        entity.setCausaleDeposito(dto.getCausaleDeposito());

        CategoriaDeposito categoriaDeposito = new CategoriaDeposito();
        categoriaDeposito.setId(Long.parseLong(dto.getCategoriaDepositoId()));
        entity.setCategoriaDeposito(categoriaDeposito);

        TipoIstanza tipoIstanza = new TipoIstanza();
        tipoIstanza.setId(Long.parseLong(dto.getTipoId()));
        entity.setTipo(tipoIstanza);

        QualitaRichiedente qualitaRichiedente = new QualitaRichiedente();
        qualitaRichiedente.setId(Long.parseLong(dto.getQualitaRichiedenteId()));

        entity.setInserimentoManuale(dto.isInserimentoManuale()? FlagSN.S : FlagSN.N);
        return entity;
    }

    @Override
    public IstanzaDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDto dto = new IstanzaDto();
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));

        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));

        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());

        dto.setCategoriaDepositoId(String.valueOf(entity.getCategoriaDeposito().getId()));
        dto.setTipoId(String.valueOf(entity.getTipo().getId()));
        dto.setQualitaRichiedenteId(String.valueOf(entity.getQualitaRichiedente().getId()));
        dto.setStato(entity.getStato().getDescrizione());
        return dto;
    }

}

