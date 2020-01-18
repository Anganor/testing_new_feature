package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String challenge = secondChallenge.probablyIWillThrowException(1, 5);
            System.out.println(challenge);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Test.");
        }
    }
}
