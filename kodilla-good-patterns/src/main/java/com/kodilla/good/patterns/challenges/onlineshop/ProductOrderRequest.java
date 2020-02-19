package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDate;
import java.util.Objects;

public class ProductOrderRequest {
    private User user;
    private LocalDate orderDate;
    private Product product;
    private int quantity;
    private int transactionID;

    public ProductOrderRequest(User user, LocalDate orderDate, Product product, int quantity, int transactionID) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.transactionID = transactionID;
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

    public int getTransactionID() {
        return transactionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOrderRequest that = (ProductOrderRequest) o;
        return quantity == that.quantity &&
                transactionID == that.transactionID &&
                Objects.equals(user, that.user) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return transactionID;
    }
}
