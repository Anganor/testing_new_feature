package com.kodilla.good.patterns.challenges.onlineshop;

public class User {
    private String username;
    private String name;
    private String lastname;
    private int phoneNumber;
    private String email;

    public User(String username, String name, String lastname, int phoneNumber, String email) {
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
