package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testCalculations {

    @Test
    public void testAdd() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When / Act
        double value = calculator.add(1, 2);

        // Then / Assert
        Assert.assertEquals(3, value, 0.01);
    }

    @Test
    public void testSub() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When / Act
        double value = calculator.sub(2, 1);

        // Then / Assert
        Assert.assertEquals(1, value, 0.01);
    }

    @Test
    public void testMul() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When / Act
        double value = calculator.mul(2, 2);

        // Then / Assert
        Assert.assertEquals(4, value, 0.01);
    }

    @Test
    public void testDiv() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When / Act
        double value = calculator.div(4, 2);

        // Then / Assert
        Assert.assertEquals(2, value, 0.01);
    }
}
