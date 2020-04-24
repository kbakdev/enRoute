package com.enRoute.enRoute.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany
    private Long destinationID;
    private String city;
    private String name;
    private Set<Deliver> delivers;
    private Set<StoreHouse> storeHouses;

    public Destination(Long destinationID, String city, String name) {
        this.destinationID = destinationID;
        this.city = city;
        this.name = name;
    }

    public Destination(Long destinationID, String city, String name, Set<Deliver> delivers, Set<StoreHouse> storeHouses){
        this.destinationID = destinationID;
        this.city = city;
        this.name = name;
        this.delivers = delivers;
        this.storeHouses = storeHouses;
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

    public Set<Deliver> getDelivers(){
        return delivers;
    }

    public void setDelivers(Set<Deliver> delivers) {
        this.delivers = delivers;
    }

    public Set<StoreHouse> getStoreHouses(){
        return storeHouses;
    }

    public void setStoreHouses(Set<StoreHouse> storeHouses){
        this.storeHouses = storeHouses;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationID=" + destinationID +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", delivers=" + delivers +
                ", storeHouses=" + storeHouses +
                '}';
    }
}
