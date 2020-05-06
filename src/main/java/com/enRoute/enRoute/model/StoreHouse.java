package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "StoreHouse")
public class StoreHouse {

    @Id
    @Column(name = "storeHouse_id")
    private Long storeHouse_id;
    @Column(name = "storeHouse_city")
    private String city;
    @Column(name = "storeHouse_name")
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