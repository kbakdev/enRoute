package com.enRoute.enRoute.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeHouseID;
    private String city;
    private String name;

    public StoreHouse(Long storeHouseID, String city, String name) {
        this.storeHouseID = storeHouseID;
        this.city = city;
        this.name = name;
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

    @Override
    public String toString() {
        return "StoreHouse{" +
                "storeHouseID=" + storeHouseID +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
