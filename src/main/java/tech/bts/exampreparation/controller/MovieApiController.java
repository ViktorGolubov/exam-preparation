package tech.bts.exampreparation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.exampreparation.Example;
import tech.bts.exampreparation.model.Movie;
import tech.bts.exampreparation.service.MovieService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(path = "/api/movies")

public class MovieApiController {

    private MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(method = POST )
    public void addMovie(Movie movie) {

        this.movieService.addMovie(movie);

    }
}
