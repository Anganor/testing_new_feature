package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorProcessor {
    public static String properOrder(Order order) {
        if (order.foodProducer.process(order)) {
            return "The order for " + order.getCustomer().getName() + " is being prepared.";
        } else {
            return "The order cannot be processed.";
        }
    }
}
