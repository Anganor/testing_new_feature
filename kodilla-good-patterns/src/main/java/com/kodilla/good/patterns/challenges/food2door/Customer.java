package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private String name;
    private String lastname;
    private String email;
    private int phoneNumber;
    private Address address;

    public Customer(String name, String lastname, String email, int phoneNumber, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address.getCity() + " ," + address.getStreetName() + " " + address.getBuildingNumber() + "/" + address.getFlatNumber();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
