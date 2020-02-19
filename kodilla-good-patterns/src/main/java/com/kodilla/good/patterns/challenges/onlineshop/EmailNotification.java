package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class EmailNotification implements InformationService {
    @Override
    public void inform(User user, LocalDate orderDate) {
        System.out.println("Order was made at: " + orderDate);
    }
}
