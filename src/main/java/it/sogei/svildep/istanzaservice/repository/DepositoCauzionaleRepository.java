package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DepositoCauzionale;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DepositoCauzionaleRepository implements IstanzaRepository<DepositoCauzionale> {

    @Override
    public Map<Long, DepositoCauzionale> getDatabase() {
        return new HashMap<>();
    }
}
