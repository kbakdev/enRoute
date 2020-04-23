package com.enRoute.enRoute.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {

    @Id
    private Long packageID;
    private Long storeHouseID;
    private Long deliverID;
    private Long destinationID;

    public Menu(long packageID, long storeHouseID, long deliverID, long destinationID) {
        this.packageID = packageID;
        this.storeHouseID = storeHouseID;
        this.deliverID = deliverID;
        this.destinationID = destinationID;
    }

    public long getPackageID() {
        return packageID;
    }

    public void setPackageID(long packageID) {
        this.packageID = packageID;
    }

    public long getStoreHouseID() {
        return storeHouseID;
    }

    public void setStoreHouseID(long storeHouseID) {
        this.storeHouseID = storeHouseID;
    }

    public long getDeliverID() {
        return deliverID;
    }

    public void setDeliverID(long deliverID) {
        this.deliverID = deliverID;
    }

    public long getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(long destinationID) {
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
