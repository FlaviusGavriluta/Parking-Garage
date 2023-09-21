package org.example.enums;

public enum ParkingSpotType {
    SMALL(9.99),
    LARGE(19.99);
    private final double price;

    ParkingSpotType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ParkingSpotType{" +
                "price=" + price +
                '}';
    }
}