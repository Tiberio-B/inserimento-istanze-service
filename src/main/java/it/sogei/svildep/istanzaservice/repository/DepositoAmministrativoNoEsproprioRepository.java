package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativoNoEsproprio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DepositoAmministrativoNoEsproprioRepository implements IstanzaRepository<DepositoAmministrativoNoEsproprio> {

    @Override
    public Map<Long, DepositoAmministrativoNoEsproprio> getDatabase() {
        return new HashMap<>();
    }
}
