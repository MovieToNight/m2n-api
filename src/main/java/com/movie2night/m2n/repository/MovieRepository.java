package com.movie2night.m2n.repository;

import com.movie2night.m2n.pojo.MovieCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MovieRepository extends CrudRepository<MovieCard, Long> {

    List<MovieCard> getMovieCardByType(String movieType);
}
