package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
        // Given / Arrange
        Circle circle = new Circle();

        // When / Act
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        // Then / Assert
        Assert.assertEquals("This is a circle.", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        // Given / Arrange
        Triangle triangle = new Triangle();

        // When / Act
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        // Then / Assert
        Assert.assertEquals("This is a triangle.", result);
    }
}
