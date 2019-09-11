package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Testing Shape Collector.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testing has ended.");
    }

    @Test
    public void testAddFigure() {
        //Given / Arrange
        Circle circle = new Circle("Circle", 3.14);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When / Act
        shapeCollector.addFigure(circle);

        //Then / Assert
        Assert.assertEquals(1, shapeCollector.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given / Arrange
        Circle circle = new Circle("Circle", 3.14);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        //When / Act
        shapeCollector.removeFigure(circle);

        //Then / Assert
        Assert.assertEquals(0, shapeCollector.size());
    }

    @Test
    public void testGetFigure() {
        //Given / Arrange
        Square square = new Square("Square", 16);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //When / Act
        Shape shape;
        shape = shapeCollector.getFigure(0);

        //Then / Assert
        Assert.assertEquals(square, shape);
    }

    @Test
    public void testShowFigures() {
        //Given / Arrange
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("Circle", 3.14));
        shapeCollector.addFigure(new Square("Square", 16));
        shapeCollector.addFigure(new Triangle("Triangle", 5));

        //When / Act
        shapeCollector.showFigures();

        //Then / Assert
        Assert.assertEquals(3, shapeCollector.size());
    }
}
