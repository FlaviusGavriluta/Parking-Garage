package org.example.model;

import org.example.enums.VehicleType;

public class Vehicle {
    private final int id;
    private static int count = 0;
    private VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType) {
        this.id = ++count;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }
}