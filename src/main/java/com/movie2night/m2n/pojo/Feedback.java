
package com.movie2night.m2n.pojo;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "message")
    private String message;

    public Feedback() {
    }

    public Feedback(String message) {
        this.message =  message;
    }
}
