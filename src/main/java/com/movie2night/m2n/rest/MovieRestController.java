package com.movie2night.m2n.rest;

import com.movie2night.m2n.model.MovieType;
import com.movie2night.m2n.pojo.MovieCard;
import com.movie2night.m2n.pojo.MovieTitleAndPoster;
import com.movie2night.m2n.pojo.MyImage;
import com.movie2night.m2n.pojo.TypeToMovieWrapper;
import com.movie2night.m2n.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @PostMapping(value = "/add", consumes = "application/json")
    @CrossOrigin
    public String test(@RequestBody Map imdbData) {
        LinkedHashMap<String, String> data = ((LinkedHashMap) ((LinkedHashMap) imdbData.get("imdbData")).get("data"));
        LinkedHashMap<String, Object> ratingAndTypeMap = ((LinkedHashMap) imdbData);

        MovieCard movieCard = MovieCard.builder()
                .actors(data.get("Actors"))
                .date(data.get("Released"))
                .description(data.get("Plot"))
                .genre(data.get("Genre"))
                .url(data.get("Poster"))
                .imdbRating(data.get("imdbRating"))
                .name(data.get("Title"))
                .rating(Float.valueOf((Integer) ratingAndTypeMap.get("rating")) / 2)
                .type(MovieType.getType((Integer) ratingAndTypeMap.get("type")).type)
                .runtime(data.get("Runtime"))
                .build();
        movieService.save(movieCard);
        return "Saved successfully";
    }


    @GetMapping(value = "/movies")
    @CrossOrigin
    public TypeToMovieWrapper getAllMovieList() {
        TypeToMovieWrapper typeToMovieWrapper = new TypeToMovieWrapper();
        List<MovieCard> data = movieService.getData();
        data.forEach(val -> {
            Map<String, List<MovieCard>> movieTypeToMovies = typeToMovieWrapper.getMovieTypeToMovies();
            if (movieTypeToMovies.containsKey(val.getType())) {
                movieTypeToMovies.get(val.getType()).add(val);
            } else {
                List<MovieCard> movieCards = new ArrayList<>();
                movieCards.add(val);
                movieTypeToMovies.put(val.getType(), movieCards);
            }
        });
        return typeToMovieWrapper;
    }

    @GetMapping(value = "/types")
    @CrossOrigin
    public List<String> getMovieType() {
        return Stream.of(MovieType.values())
                .filter(type -> type.type != MovieType.NOT_FOUND.type)
                .map(val -> val.type)
                .collect(Collectors.toList());
    }


    @GetMapping(value = "/similarMovies/{movieName}")
    @CrossOrigin
    public List<MovieCard> getSimilarMovies(@PathVariable String movieName) {
        String movieType = movieService.getMovieTypeByName(movieName).getType();
        return movieService
                .getMovieTypes(movieType)
                .stream()
                .filter(movieCard -> !movieCard.getName().equals(movieName))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/movieWithPoster")
    @CrossOrigin
    public List<MovieTitleAndPoster> getAllMovieWithPoster() {
        return movieService.getMovieListWithPoster()
                .stream()
                .map(val -> {
                    if (val.length == 2) {
                        return new MovieTitleAndPoster(val[0], val[0], val[0], new MyImage(true, val[1]));
                    } else if (val.length == 1) {
                        return new MovieTitleAndPoster(val[0], val[0], val[0], new MyImage());
                    } else {
                        return new MovieTitleAndPoster();
                    }
                })
                .distinct()
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/type/{movieType}")
    @CrossOrigin
    public List<MovieCard> getMoviesOfType(@PathVariable String movieType) {
        MovieType type = MovieType.getTypeFromName(movieType);
        return movieService.getMovieTypes(movieType);
    }


    @GetMapping(value = "/allMovies")
    @CrossOrigin
    public List<MovieCard> getMovies() {
        return movieService.getMovie();
    }


}
