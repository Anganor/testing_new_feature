package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Order {
    private int orderNumber;
    private Customer customer;
    private Product product;
    FoodProducer foodProducer;

    public Order(int orderNumber, Customer customer, Product product, FoodProducer foodProducer) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.product = product;
        this.foodProducer = foodProducer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber &&
                customer.equals(order.customer) &&
                product.equals(order.product) &&
                foodProducer.equals(order.foodProducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customer, product, foodProducer);
    }
}
