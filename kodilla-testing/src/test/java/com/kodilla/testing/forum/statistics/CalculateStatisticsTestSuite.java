package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculateStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWith0Posts() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("User");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(10, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("User1");
        usersList.add("User2");
        usersList.add("User3");
        usersList.add("User4");
        usersList.add("User5");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(200, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(100, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(0.5, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWithNoComments() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("User1");
        usersList.add("User2");
        usersList.add("User3");
        usersList.add("User4");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(25, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWithLessComments() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("User");
        usersList.add("User");
        usersList.add("User");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(333, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(33, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(0.1, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWithMoreComments() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("User1");
        usersList.add("User2");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(5, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(50, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(10, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWithNoUsers() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(0, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(0, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(0, calculateStatistics.getAvgCommentsPerPost(), 1);
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When / Act
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then / Assert
        assertEquals(10, calculateStatistics.getAvgPostsPerUser(), 1);
        assertEquals(10, calculateStatistics.getAvgCommentsPerUser(), 1);
        assertEquals(1, calculateStatistics.getAvgCommentsPerPost(), 1);
    }
}
