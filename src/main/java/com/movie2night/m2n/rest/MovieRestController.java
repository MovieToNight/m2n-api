package com.movie2night.m2n.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRestController {


    @GetMapping(value = "/demo")
    public String test() {
        return "Its demo";
    }
}
