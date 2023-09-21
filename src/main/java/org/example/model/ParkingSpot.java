package org.example.model;

import org.example.enums.ParkingSpotType;

public class ParkingSpot {
    private final int id;
    private ParkingSpotType parkingSpotType;
    private static int count;
    private boolean isEmpty;

    public ParkingSpot(ParkingSpotType parkingSpot) {
        this.id = ++count;
        this.parkingSpotType = parkingSpot;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void setOccupied() {
        this.isEmpty = false;
    }

    public int getId() {
        return id;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", parkingSpot=" + parkingSpotType +
                '}';
    }
}
