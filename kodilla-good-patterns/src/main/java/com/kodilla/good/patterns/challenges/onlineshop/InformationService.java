package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public interface InformationService {
    void inform(User user, LocalDate orderDate);
}
