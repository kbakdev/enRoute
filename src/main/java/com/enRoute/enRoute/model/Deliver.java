package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity (name = "delivers")
public class Deliver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private Long deliverID;
    private String name;
    private Set<Destination> destinations;
    private Set<StoreHouse> storeHouses;

    public Deliver(Long deliverID, String name) {
        this.deliverID = deliverID;
        this.name = name;
    }

    public Deliver(Long deliverID, String name, Set<Destination> destinations, Set<StoreHouse> storeHouses){
        this.deliverID = deliverID;
        this.name = name;
        this.destinations = destinations;
        this.storeHouses = storeHouses;
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

    public Set<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(Set<Destination> destinations) {
        this.destinations = destinations;
    }

    public Set<StoreHouse> getStoreHouses() {
        return storeHouses;
    }

    public void setStoreHouses(Set<StoreHouse> storeHouses) {
        this.storeHouses = storeHouses;
    }

    @Override
    public String toString() {
        return "Deliver{" +
                "deliverID=" + deliverID +
                ", name='" + name + '\'' +
                ", destinations=" + destinations +
                ", storeHouses=" + storeHouses +
                '}';
    }
}
