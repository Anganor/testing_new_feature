package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements FoodProducer {
    private List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public boolean process(Order order) {
        return productsList.contains(order.getProduct());
    }

    @Override
    public List<Product> getProducts() {
        return productsList;
    }
}
