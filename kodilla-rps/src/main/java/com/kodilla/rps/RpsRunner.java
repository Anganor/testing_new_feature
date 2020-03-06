package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.GameMenu.showGameMenu;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        Player player = new Player();


        player.getUsername(scanner);

        player.getRounds(scanner);
        showGameMenu();
        computer.getComputerChoice();
        player.getPlayerChoice(scanner);





    }
}
