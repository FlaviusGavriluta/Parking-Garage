package org.example;

import org.example.enums.ParkingSpotType;
import org.example.enums.VehicleType;
import org.example.model.ParkingSpot;
import org.example.model.Ticket;
import org.example.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingGarage {
    private List<ParkingSpot> parkingSpots;
    private List<Ticket> tickets;

    public ParkingGarage(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
        this.tickets = new ArrayList<>();
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.CAR
                && parkingSpots.stream()
                .filter(ParkingSpot::isEmpty)
                .map(ParkingSpot::getParkingSpotType)
                .toList()
                .contains(ParkingSpotType.SMALL)) {
            return createTicketAndOccupySpot(ParkingSpotType.SMALL, vehicle);
        } else return createTicketAndOccupySpot(ParkingSpotType.LARGE, vehicle);
    }

    private Ticket createTicketAndOccupySpot(ParkingSpotType spotType, Vehicle vehicle) {
        return parkingSpots.stream()
                .filter(parkingSpot -> parkingSpot.isEmpty() && parkingSpot.getParkingSpotType() == spotType)
                .findFirst()
                .map(parkingSpot -> {
                    parkingSpot.setOccupied();
                    return new Ticket(parkingSpot, vehicle);
                }).orElse(null);
    }
}