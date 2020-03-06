package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    String username;
    int rounds;
    String playerChoice;

    public String getUsername(Scanner scanner) {
        System.out.println("Please enter your nickname:");
        username = scanner.nextLine();
        System.out.println("Welcome " + username + "!\n");
        return username;
    }

    public int getRounds(Scanner scanner) {
        System.out.println("Please enter number of rounds you need to win:");
        rounds = scanner.nextInt();
        System.out.println("You have chosen " + rounds + " rounds.\n");
        return rounds;
    }

    public String getPlayerChoice(Scanner scanner) {
        playerChoice = scanner.nextLine();
        /*if (playerChoice == "R") {
            playerChoice = "R";
        } else if (playerChoice == "P") {
            playerChoice = "P";
        } else if (playerChoice == "S") {
            playerChoice = "S";
        } else {
            System.out.println("Your input is wrong! Please try again.");
        }*/
        return playerChoice;
    }
}
