package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle() {
        // Given / Arrange
        ShapeFactory factory = new ShapeFactory();

        // When / Act
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);

        // Then / Assert
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());
    }

    @Test
    public void testFactorySquare() {
        // Given / Arrange
        ShapeFactory factory = new ShapeFactory();

        // When / Act
        Shape square = factory.makeShape(ShapeFactory.SQUARE);

        // Then / Assert
        Assert.assertEquals(28.0, square.getCircumference(), 0);
        Assert.assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle() {
        // Given / Arrange
        ShapeFactory factory = new ShapeFactory();

        // When / Act
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);

        // Then / Assert
        Assert.assertEquals(37.50, rectangle.getArea(), 0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
    }
}
