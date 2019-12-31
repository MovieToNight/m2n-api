package com.movie2night.m2n.rest;

import com.movie2night.m2n.pojo.ImdbData;
import com.movie2night.m2n.pojo.MovieInfo;
import com.movie2night.m2n.service.MovieService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @PostMapping(value = "/add", consumes = "application/json")
    @CrossOrigin
    public String test(@RequestBody Map imdbData) {
        LinkedHashMap data = (LinkedHashMap) ((LinkedHashMap) imdbData.get("imdbData")).get("data");
        return imdbData.toString();
    }
}
