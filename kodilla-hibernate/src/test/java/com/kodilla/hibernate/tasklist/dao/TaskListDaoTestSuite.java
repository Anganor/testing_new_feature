package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "1st list";

    @Test
    public void testFindByListName() {
        // Given / Arrange
        TaskList taskList = new TaskList(LISTNAME, "Testing the list creation");
        taskListDao.save(taskList);

        // When / Act
        String foundedList = taskList.getListName();

        // Then / Assert
        Assert.assertEquals("1st list", foundedList);

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testSizeOfList() {
        // Given / Arrange
        TaskList taskList = new TaskList(LISTNAME, "Testing the list creation");
        taskListDao.save(taskList);

        // When / Act
        long size = taskListDao.count();

        // Then / Assert
        Assert.assertEquals(1, size);

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        // Given / Arrange
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        // When / Act
        taskListDao.save(taskList);
        int id = taskList.getId();

        // Then / Assert
        Assert.assertEquals(1, id);

        // CleanUp
        taskListDao.deleteById(id);
    }

}
