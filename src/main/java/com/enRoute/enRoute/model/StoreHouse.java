package com.enRoute.enRoute.model;

import javax.persistence.*;

/**
 * @author Kacper Bąk, Paweł Norwa
 */


@Entity
public class StoreHouse {

    @Id
    private Long storeHouse_id;
    private String city;
    private String name;


    public StoreHouse() {
    }

    public StoreHouse(Long storeHouse_id, String city, String name) {
        this.storeHouse_id = storeHouse_id;
        this.city = city;
        this.name = name;
    }

    public Long getStoreHouse_id() {
        return storeHouse_id;
    }

    public void setStoreHouse_id(Long storeHouse_id) {
        this.storeHouse_id = storeHouse_id;
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
                "storeHouse_id=" + storeHouse_id +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
