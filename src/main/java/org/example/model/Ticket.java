package org.example.model;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime localDateTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.localDateTime = LocalDateTime.now();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "localDateTime=" + localDateTime +
                ", parkingSpot=" + parkingSpot +
                ", vehicle=" + vehicle +
                '}';
    }
}
