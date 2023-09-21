package org.example.enums;

import java.util.List;

public enum VehicleType {
    CAR(List.of(ParkingSpotType.SMALL, ParkingSpotType.LARGE)),
    TRUCK(List.of(ParkingSpotType.LARGE));
    private final List<ParkingSpotType> parkingSpotTypeList;

    VehicleType(List<ParkingSpotType> parkingSpotTypeList) {
        this.parkingSpotTypeList = parkingSpotTypeList;
    }

    public List<ParkingSpotType> getParkingSpotTypeList() {
        return parkingSpotTypeList;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "parkingSpotTypeList=" + parkingSpotTypeList +
                '}';
    }
}
