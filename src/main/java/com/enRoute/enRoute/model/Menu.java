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
    private Long storeHouse;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deliver_id")
    private Long deliver;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destination_id")
    private Long destination;


    public Menu(Long parcel, Long storeHouse, Long deliver, Long destination) {
    }

    public Long getParcel() {
        return parcel;
    }

    public void setParcel(Long parcel) {
        this.parcel = parcel;
    }

    public Long getStoreHouse() {
        return storeHouse;
    }

    public void setStoreHouse(Long storeHouse) {
        this.storeHouse = storeHouse;
    }

    public Long getDeliver() {
        return deliver;
    }

    public void setDeliver(Long deliver) {
        this.deliver = deliver;
    }

    public Long getDestination() {
        return destination;
    }

    public void setDestination(Long destination) {
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