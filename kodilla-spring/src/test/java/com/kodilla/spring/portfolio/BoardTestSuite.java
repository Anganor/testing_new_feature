package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");

        // When / Act
        toDoList.addTask("Buy flowers.");
        inProgressList.addTask("Get the house cleaned.");
        doneList.addTask("Walk the dog.");
        doneList.addTask("Empty the washing machine");

        boolean checkInProgressTask = inProgressList.getTasks().contains("Get the house cleaned.");
        int toDoListSize = toDoList.getTasks().size();
        int doneListSize = doneList.getTasks().size();

        // Then / Assert
        Assert.assertTrue(checkInProgressTask);
        Assert.assertEquals(toDoListSize, 1);
        Assert.assertEquals(doneListSize, 2);
    }

    @Test
    public void testRemoveTask() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList doneList = (TaskList) context.getBean("doneList");

        // When / Act
        doneList.addTask("Buy flowers.");
        doneList.addTask("Get the house cleaned.");
        doneList.addTask("Walk the dog.");
        doneList.removeTask("Get the house cleaned.");

        int doneListSize = doneList.getTasks().size();

        // Then / Assert
        Assert.assertEquals(doneListSize, 2);
    }
}
