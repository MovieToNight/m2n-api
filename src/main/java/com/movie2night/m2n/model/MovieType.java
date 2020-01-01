package com.movie2night.m2n.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MovieType {
    NOT_FOUND(0, "Un-Categorised"),
    TIME_TRAVEL(1, "Time Travel"),
    TIME_LOOP(2, "Time Loop"),
    MARVEL(3, "Marvel"),
    DC(4, "DC"),
    MIND_BENDING(5, "Mind Bending"),
    CHRISTOPHER_NOLAN(6, "Christopher Nolan"),
    SPACE(7, "Space"),
    PARALLEL_UNIVERSE(8, "Parallel Universe"),
    MYSTERY(9, "Mystery"),
    DEJA_VU(10, "Deja Vu"),
    PSYCHOLOGICAL_THRILLERS(11, "Psychological Thrillers"),
    SI_FI(12, "Si-Fi");

    public Integer id;
    public String type;

    MovieType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }


    public static MovieType getType(Integer movieType) {
        List<MovieType> movieTypes = Stream.of(MovieType.values())
                .filter(val -> val.id == movieType)
                .collect(Collectors.toList());

        if (movieTypes.size() > 1) {
            return NOT_FOUND;
        } else if (movieTypes.size() == 1) {
            return movieTypes.get(0);
        } else {
            return NOT_FOUND;
        }
    }


    public static MovieType getTypeFromName(String movieType) {
        List<MovieType> movieTypes =
                Stream.of(MovieType.values())
                        .filter(val -> val.type == movieType)
                        .collect(Collectors.toList());

        if (movieTypes.size() > 1) {
            return NOT_FOUND;
        } else if (movieTypes.size() == 1) {
            return movieTypes.get(0);
        } else {
            return NOT_FOUND;
        }
    }

}
