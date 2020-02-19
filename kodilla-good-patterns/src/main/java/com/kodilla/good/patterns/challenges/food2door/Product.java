package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity);
    }
}
