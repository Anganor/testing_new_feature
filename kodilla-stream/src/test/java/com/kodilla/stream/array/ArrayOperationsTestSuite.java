package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given / Arrange
        int[] numbers = {2, 3, 4, 4, 5, 6, 4, 6, 3, 6, 6, 7, 3, 7, 3, 1, 1, 9, 2, 5};

        //When / Act
        double average = ArrayOperations.getAverage(numbers);

        //Then / Assert
        Assert.assertEquals(4.35, average, 0.001);
    }
}
