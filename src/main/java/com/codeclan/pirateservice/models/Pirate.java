package com.codeclan.pirateservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="pirates")
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;


    // with out this we will get stack overflow
    @JsonIgnoreProperties("pirates")
    @ManyToOne
    // it takes the instance of the ship but stores only the id in to the database
    @JoinColumn(name = "ship_id",nullable=false)
    private Ship ship;

    public Pirate(String firstName, String lastName, int age,Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship=ship;
    }

    // default constructor
    public Pirate() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
