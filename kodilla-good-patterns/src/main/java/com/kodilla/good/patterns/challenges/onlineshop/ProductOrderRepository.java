package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDate orderDate, Product product, int quantity);
}
