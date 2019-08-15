package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> evenNumbers;

    OddNumbersExterminator() {
        evenNumbers = new ArrayList<>();
    }

    void exterminate(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers.size());
    }
}
