package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DecretoSvincoloReintroito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DecretoSvincoloReintroitoRepository implements IstanzaRepository<DecretoSvincoloReintroito> {

    @Override
    public Map<Long, DecretoSvincoloReintroito> getDatabase() {
        return new HashMap<>();
    }
}
