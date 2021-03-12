package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DepositoVolontario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class DepositoVolontarioRepository implements IstanzaRepository<DepositoVolontario> {

    @Override
    public Map<Long, DepositoVolontario> getDatabase() {
        return new HashMap<>();
    }
}
