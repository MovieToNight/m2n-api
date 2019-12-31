package com.movie2night.m2n.repository;

import com.movie2night.m2n.model.Movie;
import org.springframework.data.repository.CrudRepository;


public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
