package com.enRoute.enRoute.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "destination")
public class Destination {

    @Id
    @Column(name = "destination_id")
    private Long destination;
    @Column(name = "destination_city")
    private String city;
    @Column(name = "destination_name")
    private String name;

    public Destination() {
    }

    public Destination(Long destination, String city, String name) {
        this.destination = destination;
        this.city = city;
        this.name = name;
    }

    public Long getDestination() {
        return destination;
    }

    public void setDestination(Long destination) {
        this.destination = destination;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destination=" + destination +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
