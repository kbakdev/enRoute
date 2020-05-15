package com.enRoute.enRoute.model;

import javax.persistence.*;

/**
 * @author Kacper Bąk, Paweł Norwa
 */


@Entity
public class Destination {

    @Id
    private Long destination_id;
    private String city;
    private String name;

    public Destination() {
    }

    public Destination(Long destination_id, String city, String name) {
        this.destination_id = destination_id;
        this.city = city;
        this.name = name;
    }

    public Long getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(Long destination_id) {
        this.destination_id = destination_id;
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
                "destination_id=" + destination_id +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}