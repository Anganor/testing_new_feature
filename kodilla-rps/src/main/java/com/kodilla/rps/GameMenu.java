package com.kodilla.rps;

public class GameMenu {

    public GameMenu() {
    }

    public static void showGameMenu() {
        System.out.println(
                "Now you will experience a simple game of Rock, Paper and Scissors!\n" +
                "Please enter your move by choosing:\n" +
                "Rock = input 'R',\n" +
                "Paper = input 'P',\n" +
                "Scissors = input 'S'.\n" +
                "If you wish to end your game, type 'x'.\n" +
                "If you wish to restart, type 'n'.\n");
    }
}
