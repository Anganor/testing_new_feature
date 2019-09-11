package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given / Arrange
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numberList = new ArrayList<>();
        // When / Act
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numberList);
        int result = evenNumbers.size();
        if(result == 0) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Error!");
        }
        // Then / Assert
        Assert.assertEquals(0, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given / Arrange
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(12);
        numberList.add(22);
        numberList.add(23);
        numberList.add(43);
        numberList.add(54);
        numberList.add(56);
        // When / Act
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numberList);
        int result = evenNumbers.size();
        if(result != 0) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Error!");
        }
        // Then / Assert
        Assert.assertEquals(4, result);
    }
}
