package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        // Given / Arrange
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);

        // When / Act
        int howManyIngredients = pizza.getIngredients().size();

        // Then / Assert
        Assert.assertEquals(3, howManyIngredients);
    }
}
