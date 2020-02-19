package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface FoodProducer {
    void process(Customer customer, Product product);
    List<Product> getProducts();
}
