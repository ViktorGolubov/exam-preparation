package tech.bts.exampreparation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.bts.exampreparation.model.Movie;
import tech.bts.exampreparation.repository.MovieRepository;
import tech.bts.exampreparation.service.MovieService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner createDummyData(MovieService movieService) {

        return args -> {

            MovieService m = new MovieService(new MovieRepository());

            m.addMovie(new Movie("Superman", 120.1, false));
            m.addMovie(new Movie("Green Mile", 143, true));
            m.addMovie(new Movie("Home alone", 180.5, false));


        };
    }
}