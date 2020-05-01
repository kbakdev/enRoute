package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "storeHouse")
public class StoreHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="storeHouse_id")
    private Long storeHouse;
    @Column(name = "storeHouse_city")
    private String city;
    @Column(name = "storeHouse_name")
    private String name;

    public StoreHouse() {
    }

    public StoreHouse(Long storeHouse, String city, String name) {
        this.storeHouse = storeHouse;
        this.city = city;
        this.name = name;
    }

    public Long getStoreHouse() {
        return storeHouse;
    }

    public void setStoreHouse(Long storeHouse) {
        this.storeHouse = storeHouse;
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
                "storeHouse=" + storeHouse +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
