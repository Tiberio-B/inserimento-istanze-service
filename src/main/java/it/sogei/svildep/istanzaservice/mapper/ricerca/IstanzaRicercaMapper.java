package it.sogei.svildep.istanzaservice.mapper.ricerca;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaRicercaDto;
import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.istanzaservice.entity.gestioneistanze.Istanza;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import javafx.util.Pair;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public abstract class IstanzaRicercaMapper<D extends IstanzaRicercaDto> {

    @Autowired private IstanzaMapper istanzaMapper;

    public List<Object> mapDtoToEntities(D dto) throws RuntimeException {
        Istanza istanzaRicerca = istanzaMapper.map(dto, new Istanza());

        LocalDate dataDa = LocalDate.parse(dto.getDataDa());
        LocalDate dataA = LocalDate.parse(dto.getDataA());

        Long numeroDepositoNazionaleDa = Long.parseLong(dto.getNumeroDepositoNazionaleDa());
        Long numeroDepositoNazionaleA = Long.parseLong(dto.getNumeroDepositoNazionaleA());

        List<Object> entities = new ArrayList<>();
        entities.add(istanzaRicerca);
        entities.add(new Pair<>(dataDa, dataA));
        entities.add(new Pair<>(numeroDepositoNazionaleDa, numeroDepositoNazionaleA));

        return entities;
    }

    public List<IstanzaTrovataDto> mapEntitiesToDto(List<Istanza> entities) {
        //TO-DO
        return null;
    }
}
