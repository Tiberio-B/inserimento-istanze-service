package it.sogei.svildep.istanzaservice;

import it.sogei.svildep.istanzaservice.dto.istanza.ricerca.istanza.IstanzaTrovataDto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MockDataLoader implements ApplicationRunner {

    public static final int NUM_ISTANZE = 10;


    public static Map<String, IstanzaTrovataDto> databaseIstanze = new HashMap<>();

    public void run(ApplicationArguments args) {
        initIstanze(NUM_ISTANZE);
    }

    private void initIstanze(int numIstanze) {
        for (int i=0; i < numIstanze; i++) {
            databaseIstanze.put(String.valueOf(i), new IstanzaTrovataDto());
        }
    }

}
