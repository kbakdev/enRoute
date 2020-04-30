package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Deliver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliverID;
    private String name;

    public Deliver() {
    }

    public Deliver(Long deliverID, String name) {
        this.deliverID = deliverID;
        this.name = name;
    }

    public Long getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(Long deliverID) {
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
