package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface FoodProducer {
    void process(Customer customer, Map<Product, Integer> orderedProducts);
}
