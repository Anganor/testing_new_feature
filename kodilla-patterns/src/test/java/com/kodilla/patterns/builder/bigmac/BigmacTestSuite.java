package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        // Given / Arrange
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("normal bun")
                .sauce("bbq sauce")
                .burgers(1)
                .ingredients(Ingredients.onion)
                .ingredients(Ingredients.bacon)
                .ingredients(Ingredients.cheese)
                .build();
        System.out.println(bigmac);

        // When / Act
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String ingredient = bigmac.getIngredients().get(1).name();

        // Then / Assert
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertEquals("bacon", ingredient);
    }
}
