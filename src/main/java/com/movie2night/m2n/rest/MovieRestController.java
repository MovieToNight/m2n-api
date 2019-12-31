package com.movie2night.m2n.rest;

import com.movie2night.m2n.pojo.MovieCard;
import com.movie2night.m2n.pojo.TypeToMovieWrapper;
import com.movie2night.m2n.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @PostMapping(value = "/add", consumes = "application/json")
    @CrossOrigin
    public String test(@RequestBody Map imdbData) {
        LinkedHashMap data = (LinkedHashMap) ((LinkedHashMap) imdbData.get("imdbData")).get("data");
        return imdbData.toString();
    }


    @GetMapping(value = "/movies")
    @CrossOrigin
    public TypeToMovieWrapper getAllMovieList() {
        TypeToMovieWrapper typeToMovieWrapper = new TypeToMovieWrapper();

        List<MovieCard> list = new ArrayList<>();
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));
        list.add(new MovieCard(
                1L,
                "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                "Kuch Kuch Hota Ha",
                "27th December 1099",
                5,
                "Action"
        ));

        typeToMovieWrapper.setMovieTypeToMovies("Time Travel", list);

        typeToMovieWrapper.setMovieTypeToMovies("SIFI",
                Arrays
                        .asList(
                                new MovieCard(
                                        2L,
                                        "https://m.media-amazon.com/images/M/MV5BNGNhNWMwNTgtZmNlOS00OGM3LWIxYzItOWQwZDJjMzQ3MzRlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg",
                                        "Kuch Kuch Hota Ha",
                                        "27th December 1099",
                                        5,
                                        "Sci-Fi"
                                )
                        ));

        return typeToMovieWrapper;
    }
}
