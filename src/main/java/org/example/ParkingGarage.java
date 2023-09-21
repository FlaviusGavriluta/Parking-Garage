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
        for (ParkingSpotType spotType : vehicle.getVehicleType().getParkingSpotTypeList()) {
            ParkingSpot spot = parkingSpots.stream()
                    .filter(parkingSpot -> parkingSpot.isEmpty()
                            && parkingSpot.getParkingSpotType().equals(spotType))
                    .findFirst()
                    .orElse(null);
            if (spot != null) {
                spot.setOccupied();
                Ticket ticket = new Ticket(spot, vehicle);
                tickets.add(ticket);
                System.out.println(ticket);
                return ticket;
            }
        }
        System.out.println("No parking spots available for: " + vehicle);
        return null;
    }
}