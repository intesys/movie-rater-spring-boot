# Movie Rater

Movie Rater è un'applicazione web che mostra ai visitatori 2 film scelti in modo casuale e permette loro di scegliere 
il preferito tra i 2. Ogni volta che un utente vota uno dei 2 film l'applicazione aggiorna il contatore dei voti per il singolo film e propone altri 2 film sempre scelti in maniera casuale nel database.

## Dettagli Tecnici

- Progetto Maven
- Spring Boot
- JDK 17
- Spring MVC
- HTML templates gestiti via [Mustache Templates](https://mustache.github.io/)
- [MaterializeCSS](https://materializecss.com/) per il frontend 
- database h2 creato e popolato automaticamente all'avvio a partire dai file in `src/main/resources/db/migration`

## Avvio dell'applicazione

Per lanciare l'applicazione

```java
./mvnw spring-boot:run
``` 

Aprire il browser all'indirizzo 
```
http://localhost:8080
```

Per accedere al database h2 (creato automaticamente all'avvio dell'app) accedere all'url: 
```
http://localhost:8080/h2-console
``` 

Credenziali di accesso al db. 
- url: `jdbc:h2:file:~/movierater` 
- username: lasciare vuoto
- password: lasciare vuoto

## Consegna del codice

Clonare questo repository e committare i singoli task. Al termine della sessione di lavoro consegnare il codice al referente Intesys:
1. inviando al referente Intesys il progetto un link al file .zip contenente i file del progetto e la cartella .git (evitare zip via email, vengono rifiutati)
2. oppure creando un repository privato su github e condividendolo con l'[account github del referente intesys](https://github.com/orgs/intesys/people)

## Task

Si richiede quindi di implementare le seguenti funzionalità:

1. Implementare il metodo `MovieService#getMovieCount` per ritornare al frontend il numero totale di film del database
2. Implementare il metodo `MovieService#get2RandomMovies` per prendere 2 film random dal database
3. Altri task scelti e inviati dal referente Intesys


## Elementi considerati per la valutazione

- correttezza della soluzione
- numero di task completati
- performance
- pulizia del codice
- commit history
- versionamento dei sorgenti
- tempo di svolgimento

## Note
Per rendere il processo di selezione equo per tutti, si prega di non condividere con nessuno questo assignment o la soluzione proposta.



