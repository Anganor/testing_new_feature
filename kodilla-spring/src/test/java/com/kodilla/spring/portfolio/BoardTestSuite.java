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
        Board board = context.getBean(Board.class);

        // When / Act
        board.toDoList.addTask("Buy flowers.");
        board.inProgressList.addTask("Get the house cleaned.");
        board.doneList.addTask("Walk the dog.");

        boolean checkInProgressTask = board.getInProgressList().getTasks().contains("Get the house cleaned.");
        int doneListSize = board.doneList.getTasks().size();

        // Then / Assert
        Assert.assertTrue(checkInProgressTask);
        Assert.assertEquals(doneListSize, 1);
    }
}
