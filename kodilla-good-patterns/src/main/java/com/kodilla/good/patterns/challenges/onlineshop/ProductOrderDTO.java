package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;

public class ProductOrderDTO {
    private User user;
    private LocalDate orderDate;
    private Product product;
    private int quantity;
    private boolean isSold;

    public ProductOrderDTO(final User user, final LocalDate orderDate, final Product product, final int quantity, final boolean isSold) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}
