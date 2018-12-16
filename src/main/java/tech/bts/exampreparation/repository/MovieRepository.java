package tech.bts.exampreparation.repository;

import org.springframework.stereotype.Repository;
import tech.bts.exampreparation.model.Movie;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MovieRepository {

    public Map<Long, Movie> getMovieMap() {
        return movieMap;
    }

    public long getMovieId() {
        return movieId;
    }

    private Map<Long, Movie> movieMap;
    private long movieId;

    public MovieRepository() {
        this.movieMap = new HashMap<>();
        movieId = 0;
    }




}
