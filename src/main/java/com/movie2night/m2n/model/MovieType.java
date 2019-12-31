package com.movie2night.m2n.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MovieType {
    TIME_TRAVEL(1),
    TIME_LOOP(2),
    MARVEL(3),
    DC(4),
    MIND_BENDING(5),
    CHRISTOPHER_NOLAN(6),
    SPACE(7),
    PARALLEL_UNIVERSE(8),
    MYSTERY(9),
    DEJA_VU(10),
    PSYCHOLOGICAL_THRILLERS(11);

    private int type;

    MovieType(int type) {
        this.type = type;
    }


    public MovieType getType(int movieType) {
        List<MovieType> movieTypes = Stream.of(MovieType.values())
                .filter(val -> val.type == movieType)
                .collect(Collectors.toList());

        if (movieTypes.size() > 1) {
            throw new RuntimeException("Duplicate movie type found");
        } else if (movieTypes.size() == 1) {
            return movieTypes.get(0);
        } else {
            return null;
        }
    }

}
