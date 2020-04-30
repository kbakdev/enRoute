package com.enRoute.enRoute.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long destinationID;
    private String city;
    private String name;

    public Destination() {
    }

    public Destination(Long destinationID, String city, String name) {
        this.destinationID = destinationID;
        this.city = city;
        this.name = name;
    }

    public Long getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(Long destinationID) {
        this.destinationID = destinationID;
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
                "destinationID=" + destinationID +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
