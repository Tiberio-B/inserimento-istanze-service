package it.sogei.svildep.istanzaservice;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.util.GeneratoreCasuale;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MockDataLoader implements ApplicationRunner {

    public static final int NUM_ISTANZE = 10;

    private GeneratoreCasuale random = new GeneratoreCasuale();

    public static Map<String, IstanzaDto> databaseIstanze = new HashMap<>();

    public void run(ApplicationArguments args) {
        initIstanze(NUM_ISTANZE);
    }

    private void initIstanze(int numIstanze) {
        for (int i=0; i < numIstanze; i++) {
            databaseIstanze.put(String.valueOf(i), random.istanzaCasuale());
        }
    }

}
