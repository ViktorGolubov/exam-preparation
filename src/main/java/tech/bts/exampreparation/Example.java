package tech.bts.exampreparation;

import tech.bts.exampreparation.model.Movie;
import tech.bts.exampreparation.repository.MovieRepository;
import tech.bts.exampreparation.service.MovieService;


public class Example {

    public static void main(String[] args) {

        MovieService m = new MovieService(new MovieRepository());

        m.addMovie(new Movie("Superman", 120.1, false));
        m.addMovie(new Movie("Green Mile", 143, true));
        m.addMovie(new Movie("Home alone", 180.5, false));

        System.out.println(m.getAllMovies());
    }

}
