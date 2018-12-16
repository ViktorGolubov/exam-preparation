package tech.bts.exampreparation.service;

import org.springframework.stereotype.Service;
import tech.bts.exampreparation.model.Movie;
import tech.bts.exampreparation.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    public MovieService(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
        movieId = 0;
    }

    private MovieRepository movieRepo;
    private long movieId;



    public void addMovie(Movie movie) {
        movieRepo.getMovieMap().put(movieId, movie);
        movieId++;

    }

    public List<Movie> getAllMovies() {

       return new ArrayList<>(movieRepo.getMovieMap().values());

    }
}
