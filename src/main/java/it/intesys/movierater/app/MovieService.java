package it.intesys.movierater.app;

import org.javatuples.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final Logger logger = LoggerFactory.getLogger(MovieService.class);

    public Pair<Movie, Movie> get2RandomMovies() {
        return Pair.with(
                new Movie(1L,"Pulp Fiction", "Quentin Tarantino"),
                new Movie(2L, "Titanic", "James Cameron"));
    }

    public Long getMovieCount() {
        return 0L;
    }

    public void vote(Long movieId) {
        logger.info("Add vote for movie {}", movieId);
    }
}
