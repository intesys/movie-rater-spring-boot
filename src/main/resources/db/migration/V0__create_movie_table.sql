CREATE TABLE movie
(
    ID              INTEGER     NOT NULL PRIMARY KEY,
    Title           VARCHAR(350) NOT NULL,
    Release_Year    INTEGER     NOT NULL,
    Genre           VARCHAR(100) NOT NULL,
    Director        VARCHAR(100) NOT NULL,
    Actors          VARCHAR(250) NOT NULL,
    Country         VARCHAR(100) NOT NULL
);
