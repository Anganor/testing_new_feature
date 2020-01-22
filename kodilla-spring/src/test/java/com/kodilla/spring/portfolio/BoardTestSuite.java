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

        boolean checkInProgressTask = inProgressList.getTasks().contains("Get the house cleaned.");
        int doneListSize = doneList.getTasks().size();

        // Then / Assert
        Assert.assertTrue(checkInProgressTask);
        Assert.assertEquals(doneListSize, 1);
    }
}
