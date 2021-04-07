package it.sogei.svildep.istanzaservice.exception;

public interface Messages {

    String soggettoNonPresente = "Uno o più dei soggetti specificati non e' censito.";

    String erroreGenerico = "MESSAGGIO D'ERRORE DA SCRIVERE.";

    String categoriaDeposito = "E' necessario specificare la categoria deposito.";
    String tipoIstanza = "E' necessario specificare il tipo di istanza.";

    String idRTSInoltro = "Errore id RTS per inoltro.";

    String inserimento = "Inserimento effettuato con successo.";

    String numeroRichiesta = "E' necessario specificare il numero della richiesta.";

    String nonAutorizzato = "L'utente corrente non è autorizzato ad eseguire l'operazione.";

    String enteCauzionato = "E' necessario specificare l'ente richiedente.";
    String qualitaRichiedente = "E' necessario specificare la qualita' del richiedente.";
    String richiedente = "E' necessario specificare il richiedente.";

    String datiCatastali = "E' necessario specificare i dati catastali.";
    String proprietariCatastali = "E' necessario specificare almeno un proprietario catastale";
    String tipoCatasto = "E' necessario specificare il tipo del catasto.";
    String sezioneUrbana = "E' necessario specificare la sezione urbana.";
    String foglioCatasto = "E' necessario specificare il foglio del catasto.";
    String subalternoCatasto = "E' necessario specificare il subalterno del catasto.";
    String particellaCatasto = "E' necessario specificare la particella del catasto.";

    String provincia = "E' necessario specificare la provincia.";
    String comune = "E' necessario specificare il comune.";

    String causaleDeposito = "E' necessario specificare la causale del deposito.";
    String importoDeposito = "E' necessario specificare l'importo del deposito.";

    String numeroProtocollo = "E' necessario specificare il numero del protocollo.";
    String dataProtocollo = "E' necessario specificare la data del protocollo";

    String dataRichiesta = "E' necessario specificare la data della richiesta.";

    String descrizioneOpera = "E' necessario specificare la descrizione dell'opera.";
    String tipoSoggetto = "E' necessario specificare il tipo soggetto";

    String invalidDtoCode = "invalidDto";
    String invalidDtoMessage = "Il corpo della richiesta non è un DTO valido.";

    String invalidIdCode = "invalidId";
    String invalidIdMessage = "L'id acquisito non è un numero valido.";

    String invalidDateCode = "invalidDate";
    String invalidDateMessage = "La data specificata non è una data valida.";

    String invalidSessoCode = "invalidSesso";
    String invalidSessoMessage = "Il sesso specificato non è valido.";

    String invalidTipoCode = "invalidTipo";
    String invalidTipoMessage = "Il tipo specificato non è valido.";

    String invalidCategoriaCode = "invalidCategoria";
    String invalidCategoriaMessage = "La categoria specificata non è valida.";

    String invalidQualitaRichiedenteCode = "invalidQualitaRichiedente";
    String invalidQualitaRichiedenteMessage = "La qualita' richiedente specificata non è valida.";

    String invalidStatoCode = "invalidStato";
    String invalidStatoMessage = "Lo stato specificato non è valido.";

    String proprietario = "Dati proprietario non validi.";
    String versante = "Dati versante non validi.";
}
