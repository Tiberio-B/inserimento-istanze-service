package it.sogei.svildep.istanzaservice.model.geo;

import it.sogei.svildep.istanzaservice.model.Entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Nazione implements Entity {

    private Long id;
    private String nome;
    private Boolean areaSepa;
}
