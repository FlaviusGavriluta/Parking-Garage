package org.example;

import org.example.enums.ParkingSpotType;
import org.example.enums.VehicleType;
import org.example.model.ParkingSpot;
import org.example.model.Ticket;
import org.example.model.Vehicle;

import java.util.Arrays;
import java.util.List;

public class ParkingGarageFacade {
    private ParkingGarage parkingGarage;

    public ParkingGarageFacade() {
        List<ParkingSpot> parkingSpots = Arrays.asList(
                new ParkingSpot(ParkingSpotType.SMALL),
                new ParkingSpot(ParkingSpotType.SMALL),
                new ParkingSpot(ParkingSpotType.SMALL),
                new ParkingSpot(ParkingSpotType.LARGE),
                new ParkingSpot(ParkingSpotType.LARGE)
        );
        this.parkingGarage = new ParkingGarage(parkingSpots);
    }

    public void parkSomeVehicle() {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle(VehicleType.CAR),
                new Vehicle(VehicleType.CAR),
                new Vehicle(VehicleType.TRUCK),
                new Vehicle(VehicleType.CAR),
                new Vehicle(VehicleType.CAR),
                new Vehicle(VehicleType.TRUCK)
        );
        vehicles.forEach(vehicle -> parkingGarage.parkVehicle(vehicle));
    }
}
