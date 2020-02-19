package com.kodilla.good.patterns.challenges.onlineshop;

public class Car extends Product {
    private int horsePower;
    private String engineCapacity;
    private int productionYear;
    public Car(String productName, String productDescription, double productPrice, int horsePower, String engineCapacity, int productionYear) {
        super(productName, productDescription, productPrice);
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
    }
}
