package com.enRoute.enRoute.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long packageID;
    @ManyToOne
    private StoreHouse storeHouseID;
    @ManyToOne
    private Deliver deliverID;
    @ManyToOne
    private  Destination destinationID;

    public Menu(){
    }

    public Menu(Long packageID, StoreHouse storeHouseID, Deliver deliverID, Destination destinationID) {
        this.packageID = packageID;
        this.storeHouseID = storeHouseID;
        this.deliverID = deliverID;
        this.destinationID = destinationID;
    }

    public Long getPackageID() {
        return packageID;
    }

    public void setPackageID(Long packageID) {
        this.packageID = packageID;
    }

    public StoreHouse getStoreHouseID() {
        return storeHouseID;
    }

    public void setStoreHouseID(StoreHouse storeHouseID) {
        this.storeHouseID = storeHouseID;
    }

    public Deliver getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(Deliver deliverID) {
        this.deliverID = deliverID;
    }

    public Destination getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(Destination destinationID) {
        this.destinationID = destinationID;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "packageID=" + packageID +
                ", storeHouseID=" + storeHouseID +
                ", deliverID=" + deliverID +
                ", destinationID=" + destinationID +
                '}';
    }
}