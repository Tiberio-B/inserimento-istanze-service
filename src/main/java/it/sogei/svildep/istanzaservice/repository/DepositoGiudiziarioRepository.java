package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DepositoGiudiziario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DepositoGiudiziarioRepository implements IstanzaRepository<DepositoGiudiziario> {

    @Override
    public Map<Long, DepositoGiudiziario> getDatabase() {
        return new HashMap<>();
    }
}
