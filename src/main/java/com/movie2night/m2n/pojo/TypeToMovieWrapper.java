package com.movie2night.m2n.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeToMovieWrapper {
    private Map<String, List<MovieCard>> movieTypeToMovies;

    public TypeToMovieWrapper() {
        movieTypeToMovies = new HashMap<>();
    }

    public Map<String, List<MovieCard>> getMovieTypeToMovies() {
        return movieTypeToMovies;
    }

    public void setMovieTypeToMovies(String movieType, List<MovieCard> movieCards) {
        this.movieTypeToMovies.put(movieType, movieCards);
    }
}
