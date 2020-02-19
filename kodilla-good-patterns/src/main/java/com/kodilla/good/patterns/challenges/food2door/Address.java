package com.kodilla.good.patterns.challenges.food2door;

public class Address {
    private String city;
    private String streetName;
    private int buildingNumber;
    private int flatNumber;

    public Address(String city, String streetName, int buildingNumber, int flatNumber) {
        this.city = city;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    @Override
    public String toString() {
        return "Address: " + city + ", " + streetName + ", " + buildingNumber + "/" + flatNumber;
    }
}
