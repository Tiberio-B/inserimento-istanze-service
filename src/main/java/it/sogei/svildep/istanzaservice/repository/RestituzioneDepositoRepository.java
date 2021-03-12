package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.RestituzioneDeposito;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class RestituzioneDepositoRepository implements IstanzaRepository<RestituzioneDeposito> {

    @Override
    public Map<Long, RestituzioneDeposito> getDatabase() {
        return new HashMap<>();
    }
}
