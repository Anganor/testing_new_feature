package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int a = 2;
        int b = 5;

        int addition = calculator.add(a, b);
        if (addition < 10) {
            System.out.println("The result is less than 10.");
        } else {
            System.out.println("The result is higher than 10.");
        }

        int subtraction = calculator.subtract(4, 2);
        if (subtraction > 0) {
            System.out.println("The result of the subtraction is a positive number.");
        } else {
            System.out.println("The result is 0 or a negative number.");
        }


    }
}
