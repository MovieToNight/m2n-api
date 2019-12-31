package com.movie2night.m2n.service;

import com.movie2night.m2n.model.Movie;
import com.movie2night.m2n.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void save(String movieName) {
        movieRepository.save(new Movie(1L,movieName));
    }

    public Movie getData() {
        Iterable<Movie> movies = movieRepository.findAll();
        return movies.iterator().next();
    }

}
