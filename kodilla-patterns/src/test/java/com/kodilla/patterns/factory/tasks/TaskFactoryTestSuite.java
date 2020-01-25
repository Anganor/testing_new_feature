package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingFactory() {
        // Given / Arrange
        TaskFactory factory = new TaskFactory();

        // When / Act
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        // Then / Assert
        Assert.assertEquals("Grocery", shopping.getTaskName());
        Assert.assertEquals(true , shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingFactory() {
        // Given / Arrange
        TaskFactory factory = new TaskFactory();

        // When / Act
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        // Then / Assert
        Assert.assertEquals("Artwork", painting.getTaskName());
        Assert.assertEquals(true , painting.isTaskExecuted());
    }

    @Test
    public void testDrivingFactory() {
        // Given / Arrange
        TaskFactory factory = new TaskFactory();

        // When / Act
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        // Then / Assert
        Assert.assertEquals("Trip", driving.getTaskName());
        Assert.assertEquals(true , driving.isTaskExecuted());
    }
}
