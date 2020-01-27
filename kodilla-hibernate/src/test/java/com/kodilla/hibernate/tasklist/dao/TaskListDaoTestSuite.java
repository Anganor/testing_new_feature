package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        //ClenUp
        int id = taskList.getId();
        taskListDao.deleteById(id);

    }

}
