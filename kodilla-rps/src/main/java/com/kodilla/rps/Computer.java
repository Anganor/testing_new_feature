package com.kodilla.rps;

import java.util.Random;

public class Computer {
    boolean end = false;
    Random random = new Random();
    String computerChoice;
    int randomInput;

    public String getComputerChoice() {
        randomInput = random.nextInt(3) + 1;
        if (randomInput == 1) {
            computerChoice = "R";
        } else if (randomInput == 2) {
            computerChoice = "P";
        } else if (randomInput == 3){
            computerChoice = "S";
        }
        System.out.println("The computer has made it choice. Now it is your turn!" + " " + computerChoice);
        return computerChoice;
    }
}
