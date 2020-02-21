package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private double productPrice;
    private int quantity;

    public Product(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
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
        return productName.hashCode();
    }
}
