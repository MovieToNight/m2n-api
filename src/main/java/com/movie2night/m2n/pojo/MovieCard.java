package com.movie2night.m2n.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@Builder
@Table(name = "movie_cart")
public class MovieCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "POSTER_URL")
    private String url;
    @Column(name = "TITLE")
    private String name;
    @Column(name = "DATE")
    private String date;
    @Column(name = "OUR_RATING")
    private Float rating;
    @Column(name = "MOVIE_TYPE")
    private String type;
    @Column(name = "GENRE")
    private String genre;
    @Column(name = "ACTORS")
    private String actors;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IMDB_RATING")
    private String imdbRating;
    @Column(name = "runtime")
    private String runtime;

    public MovieCard() {
    }


}
