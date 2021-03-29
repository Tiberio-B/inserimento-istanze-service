package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.service.external.PersistenceService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Getter
public abstract class IstanzaService implements SvildepService {

    @Autowired private PersistenceService persistenceService;

}
