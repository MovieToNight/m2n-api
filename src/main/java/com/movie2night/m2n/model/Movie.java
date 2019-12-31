package com.movie2night.m2n.model;



import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DUMMY")
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name ="name")
    private String name;

}
