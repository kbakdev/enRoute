package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StoreHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeHouseID;
    private String city;
    private String name;
    @OneToMany
    private Set<Deliver> delivers = new HashSet<>();
    @OneToMany
    private Set<Destination> destinations = new HashSet<>();

    public StoreHouse(Long storeHouseID, String city, String name) {
        this.storeHouseID = storeHouseID;
        this.city = city;
        this.name = name;
    }

    public StoreHouse(Long storeHouseID, String city, String name, Set<Deliver> delivers, Set<Destination> destinations){
        this.storeHouseID = storeHouseID;
        this.city = city;
        this.name = name;
        this.delivers = delivers;
        this.destinations = destinations;
    }

    public Long getStoreHouseID() {
        return storeHouseID;
    }

    public void setStoreHouseID(Long storeHouseID) {
        this.storeHouseID = storeHouseID;
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

    public Set<Deliver> getDelivers() {
        return delivers;
    }

    public void setDelivers(Set<Deliver> delivers) {
        this.delivers = delivers;
    }

    public Set<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(Set<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "StoreHouse{" +
                "storeHouseID=" + storeHouseID +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", delivers=" + delivers +
                ", destinations=" + destinations +
                '}';
    }
}
