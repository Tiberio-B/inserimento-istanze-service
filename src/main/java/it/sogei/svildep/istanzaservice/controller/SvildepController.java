package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.service.SvildepService;
import org.springframework.validation.Validator;

public interface SvildepController {

    SvildepService getService();

    Validator getValidator();
}
