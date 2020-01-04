package com.movie2night.m2n.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class MovieTitleAndPoster {
    private String key;
    private String value;
    private String text;

    @JsonProperty(value = "image")
    private MyImage image;


}
