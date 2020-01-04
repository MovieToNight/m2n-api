package com.movie2night.m2n.repository;

import com.movie2night.m2n.pojo.MovieCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;


public interface MovieRepository extends CrudRepository<MovieCard, Long> {

    String FIND_MOVIE_WITH_URL = "SELECT TITLE, poster_url FROM movie_cart where title != 'null' and poster_url != 'null'";

    @Query(value = FIND_MOVIE_WITH_URL, nativeQuery = true)
    Set<String[]> findNameAndUrl();

    List<MovieCard> getMovieCardByType(String movieType);

    List<MovieCard> getMovieCardsByNameNotNull();

}
