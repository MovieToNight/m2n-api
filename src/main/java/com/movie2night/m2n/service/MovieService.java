package com.movie2night.m2n.service;

import com.movie2night.m2n.pojo.MovieCard;
import com.movie2night.m2n.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void save(MovieCard movieName) {
        movieRepository.save(movieName);
    }

    public List<MovieCard> getData() {
        Iterable<MovieCard> movies = movieRepository.findAll();
        List<MovieCard> target = new ArrayList<>();
        movies.iterator().forEachRemaining(target::add);
        return target;
    }

    public List<MovieCard> getMovieTypes(String movieType) {
        return movieRepository.getMovieCardByType(movieType);
    }

    public List<MovieCard> getMovie() {
        return movieRepository.getMovieCardsByNameNotNull();
    }

    public Set<String[]> getMovieListWithPoster() {
        return movieRepository.findNameAndUrl();
    }
}
