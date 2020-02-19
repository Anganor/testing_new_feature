package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class SmsNotification implements InformationService {
    @Override
    public void inform(User user, LocalDate orderDate) {
        System.out.println(user.getUsername() + " you ordered goods at " + orderDate);
    }
}
