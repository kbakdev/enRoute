package com.enRoute.enRoute.model;

import javax.persistence.*;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long packageID;
    @ManyToOne
    private Long storeHouseID;
    @ManyToOne
    private Long deliverID;
    @ManyToOne
    private Long destinationID;

    public Menu(){

    }

    public Menu(Long packageID, Long storeHouseID, Long deliverID, Long destinationID) {
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

    public Long getStoreHouseID() {
        return storeHouseID;
    }

    public void setStoreHouseID(Long storeHouseID) {
        this.storeHouseID = storeHouseID;
    }

    public Long getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(Long deliverID) {
        this.deliverID = deliverID;
    }

    public Long getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(Long destinationID) {
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