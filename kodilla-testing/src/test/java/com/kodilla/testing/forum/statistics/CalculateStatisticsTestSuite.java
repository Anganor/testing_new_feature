package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;

public class CalculateStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock() {
        //Given / Arrange
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

    }
}
