# Movie Rater

Movie Rater è un'applicazione web che mostra ai visitatori 2 film scelti in modo casuale e permette loro di scegliere 
il preferito tra i 2. Ogni volta che un utente vota uno dei 2 film l'applicazione aggiorna il contatore dei voti per il singolo film e propone altri 2 film sempre scelti in maniera casuale nel database.

## Dettagli Tecnici

- Progetto Maven
- Spring Boot
- JDK 1.8
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
- username: `sa` 
- password: lasciare vuoto

## Consegna del codice

Al termine del lavoro, il codice deve essere compresso in un file zip/tar e inviato alla persona di riferimento di Intesys.

Questo file **deve includere la cartella .git** per fare in modo che la commit history sia visibile 
e quindi rendere più agevole la review del codice. Si prega inoltre di **non includere la cartella target/** nel file di archivio lanciando un `./mvnw clean` prima di creare lo zip/tar.

## Task

Si richiede quindi di implementare le seguenti funzionalità:

1. Implementare il metodo `MovieService#getMovieCount` per ritornare al frontend il numero totale di film del database
2. Implementare il metodo `MovieService#get2RandomMovies` per prendere 2 film random dal database
3. Altri task scelti e inviati dal referente Intesys


## Elementi considerati per la valutazione

- numero di task completati
- pulizia del codice
- performance
- ordine e gestione sorgenti
- tempo di svolgimento

## Note
Per rendere il processo di selezione equo per tutti, si prega di non condividere con nessuno questo assignment o la soluzione proposta.



