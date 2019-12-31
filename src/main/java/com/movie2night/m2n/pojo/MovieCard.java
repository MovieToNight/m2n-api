package com.movie2night.m2n.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieCard {
    private Long id;
    private String url;
    private String name;
    private String date;
    private int rating;
    private String type;


}
