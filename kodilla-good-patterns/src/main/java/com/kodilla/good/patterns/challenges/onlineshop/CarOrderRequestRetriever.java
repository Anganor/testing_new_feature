package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class CarOrderRequestRetriever implements ProductOrderRequestRetriever{
    @Override
    public ProductOrderRequest retrieve() {
        User user = new User("Qazxswedc", "Jane", "Dove", 987654321, "abcdefg@xyz.com");
        LocalDate orderDate = LocalDate.now();
        Product product = new Car("Volvo", "SUV XC90", 150000, 150, "1.9TDi", orderDate.getYear());
        int quantity = 1;

        return new ProductOrderRequest(user, orderDate, product, quantity, 2);
    }
}
