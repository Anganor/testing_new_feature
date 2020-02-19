package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public interface ProductOrderService {
    boolean sold(User user, LocalDate orderDate, Product product, int quantity);
}
