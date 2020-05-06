package com.enRoute.enRoute.model;

import javax.persistence.*;

/**
 * @author Kacper Bąk, Paweł Norwa
 *
 */

@Entity
public class Menu {

    @Id
    private Long parcel;
    @ManyToOne
    private StoreHouse storeHouse;
    @ManyToOne
    private Deliver deliver;
    @ManyToOne
    private Destination destination;

    public Menu() {
    }

    public Menu(Long parcel, StoreHouse storeHouse, Deliver deliver, Destination destination) {
        this.parcel = parcel;
        this.storeHouse = storeHouse;
        this.deliver = deliver;
        this.destination = destination;
    }

    public Long getParcel() {
        return parcel;
    }

    public void setParcel(Long parcel) {
        this.parcel = parcel;
    }

    public StoreHouse getStoreHouse() {
        return storeHouse;
    }

    public void setStoreHouse(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "parcel=" + parcel +
                ", storeHouse=" + storeHouse +
                ", deliver=" + deliver +
                ", destination=" + destination +
                '}';
    }
}