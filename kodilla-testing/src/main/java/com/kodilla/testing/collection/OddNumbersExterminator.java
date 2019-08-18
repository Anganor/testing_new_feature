package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    void exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
    }
}
