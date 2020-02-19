package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class ToothbrushOrderRequestRetriever implements ProductOrderRequestRetriever {
    @Override
    public ProductOrderRequest retrieve() {
        User user = new User("NewUser321", "John", "Doe", 123456789, "qwerty@123.com");
        LocalDate orderDate = LocalDate.now();
        Product product = new Toothbrush("Oral B", "The best brush you can buy!", 10.99);
        int quantity = 2;

        return new ProductOrderRequest(user, orderDate, product, quantity, 1);
    }
}
