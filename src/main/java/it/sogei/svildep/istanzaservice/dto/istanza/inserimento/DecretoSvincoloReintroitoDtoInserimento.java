package it.sogei.svildep.istanzaservice.dto.istanza.inserimento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DecretoSvincoloReintroitoDtoInserimento extends InserimentoIstanzaDto {

    private List<String> categorieDepositi;



}
