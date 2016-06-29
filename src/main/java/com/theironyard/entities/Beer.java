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
    Integer id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public Integer calories;

    @OneToMany
    public User user;
}
