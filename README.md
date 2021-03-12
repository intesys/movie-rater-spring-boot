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
3. Implementare la logica di raccolta dei voti (`MovieController#submitVote`) per il singolo film
4. Scrivere un test di integrazione (`@SpringBootTest`) per testare la funzionalità di `submitVote` implementata 
   nel punto 3.
5. Mostrare in home page il numero totale di voti raccolti per tutti i film
6. Creare la pagina di dettaglio del singolo film (`http://localhost:8080/movie/{movieId}`), 
   implementando il metodo `MovieController#getMovieDetails`. La pagina dovrà mostrare il titolo, i registi, gli attori, 
   l'anno di uscita e il numero di voti del film. Permettere all'utente di navigare al dettaglio rendendo 'cliccabile' 
   il titolo del film nella home page.
7. Creare un'API REST (`/api/movies`) che ritorni la lista di tutti i film in formato JSON. 
   Per ogni film ritornare il titolo, i registi, gli attori, l'anno di uscita e il numero di voti. 
   La lista deve essere ordinata mostrando i film in ordine di voto descrescente.
8. Creare una pagina di dettaglio per il singolo attore. La pagina deve mostrare il nome dell’attore e 
   la lista dei film in cui ha recitato. Dalla pagina di dettaglio del film (punto 6), per ogni attore della lista,
   deve essere possibile navigare verso questa pagina di dettaglio. (Se opportuno, procedere alla creazione
   di nuove tabelle sul database prevedendo anche una procedura di migrazione dei dati).
9. Se un attore è tra i primi 10 o 100 più votati, mostrare rispettivamente un badge `TOP10` o `TOP100`
   nella pagina di dettaglio implementata nel punto precedente. I voti del singolo attore si calcolano sommando i voti presi dai film in cui l'attore ha recitato.  


## Elementi considerati per la valutazione

- numero di task completati
- pulizia del codice
- performance
- ordine e gestione sorgenti
- tempo di svolgimento

## Note
Per rendere il processo di selezione equo per tutti, si prega di non condividere con nessuno questo assignment o la soluzione proposta.



