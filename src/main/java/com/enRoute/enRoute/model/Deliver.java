package com.enRoute.enRoute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deliver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliverID;
    private String name;

    public Deliver(long deliverID, String name) {
        this.deliverID = deliverID;
        this.name = name;
    }

    public long getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(long deliverID) {
        this.deliverID = deliverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deliver{" +
                "deliverID=" + deliverID +
                ", name='" + name + '\'' +
                '}';
    }
}
