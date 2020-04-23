package com.enRoute.enRoute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long destinationID;
    private String city;
    private String name;

    public Destination(long destinationID, String city, String name) {
        this.destinationID = destinationID;
        this.city = city;
        this.name = name;
    }

    public long getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(long destinationID) {
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
