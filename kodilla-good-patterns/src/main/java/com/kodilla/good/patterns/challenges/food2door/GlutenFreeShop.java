package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements FoodProducer {
    private List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public void process(Customer customer, Product product) {
    }

    @Override
    public List<Product> getProducts() {
        return productsList;
    }
}
