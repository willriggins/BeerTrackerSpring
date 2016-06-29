package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by zach on 11/10/15.
 */
@Entity
@Table(name = "beers")
public class Beer {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String type;

    @Column(nullable = false)
    Integer calories;

    @ManyToOne
    User user;

    public Beer() {
    }

    public Beer(String name, String type, Integer calories, User user) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.user = user;
    }

    public Beer(int id, String name, String type, Integer calories) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.calories = calories;
    }
}
