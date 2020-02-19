package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;
import java.util.Random;

public class CarOrderService implements ProductOrderService{
    Random random = new Random();
    @Override
    public boolean sold(User user, LocalDate orderDate, Product product, int quantity) {
        return random.nextBoolean();
    }
}
