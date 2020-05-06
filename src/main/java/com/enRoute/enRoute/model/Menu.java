package com.enRoute.enRoute.model;

import javax.persistence.*;

/**
 * @author Kacper Bąk, Paweł Norwa
 *
 */

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parcel_id")
    private Long parcel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "storeHouse_id")
    private StoreHouse storeHouse_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deliver_id")
    private Deliver deliver;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destination_id")
    private Destination destination;

    public Menu(Long parcel, StoreHouse storeHouse_id, Deliver deliver, Destination destination) {
        this.parcel = parcel;
        this.storeHouse_id = storeHouse_id;
        this.deliver = deliver;
        this.destination = destination;
    }

    public Long getParcel() {
        return parcel;
    }

    public void setParcel(Long parcel) {
        this.parcel = parcel;
    }

    public StoreHouse getStoreHouse_id() {
        return storeHouse_id;
    }

    public void setStoreHouse_id(StoreHouse storeHouse_id) {
        this.storeHouse_id = storeHouse_id;
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
                ", storeHouse_id=" + storeHouse_id +
                ", deliver=" + deliver +
                ", destination=" + destination +
                '}';
    }
}