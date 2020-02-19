package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class CarOrderRepository implements ProductOrderRepository {
    public boolean createProductOrder(User user, LocalDate orderDate, Product product, int quantity) {
        return true;
    }
}
