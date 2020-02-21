package com.kodilla.good.patterns.challenges.food2door;

import static com.kodilla.good.patterns.challenges.food2door.Food2DoorProcessor.properOrder;

public class Food2DoorApplication {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Customer customer1 = new Customer("Adam", "Nowak", "asdfg@qwe.com", 123456789,
                new Address("Katowice", "Sokolska", 1, 1));
        Customer customer2 = new Customer("John", "Doe", "qwerty@asd.com", 987654321,
                new Address("Warszawa", "Katowicka", 100, 2));

        Order firstOrder = new Order(1, customer1, new Product("Bottled still water", 2.5, 10), extraFoodShop);
        Order secondOrder = new Order(2, customer2, new Product("Brown rice bag", 2, 4), glutenFreeShop);
        Order thirdOrder = new Order(3, customer1, new Product("Bottled sparkling water", 3, 5), healthyShop);

        extraFoodShop.addProduct(new Product("Bottled still water", 2.5, 10));
        extraFoodShop.addProduct(new Product("Bottled sparkling water", 3, 5));

        glutenFreeShop.addProduct(new Product("Brown rice bag", 2, 4));

        String properOrder = properOrder(firstOrder);
        System.out.println(properOrder);

        properOrder = properOrder(secondOrder);
        System.out.println(properOrder);

        properOrder = properOrder(thirdOrder);
        System.out.println(properOrder);
    }
}
