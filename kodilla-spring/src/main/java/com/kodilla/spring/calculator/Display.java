package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public double displayValue(double val) {
        System.out.println("Your value is: " + val);
        return val;
    }
}
