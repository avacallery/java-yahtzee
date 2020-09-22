package com.avacallery;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Console {
    // static class, NOT dynamic -> all methods in this class are static
    // variables do not need to be instantiated here

    static Scanner scanner = new Scanner(System.in);

    static public void startGame() {
        System.out.println("Welcome to Yahtzee!");
    }

    static public void log(String output) {
        System.out.println(output);
    }

    static public void log(int output) {
        System.out.println(output);
    }

    // needs List of dice, not the entire MyHand class
    static public void showDice(List<Die> dice) {
        System.out.println("----Your Hand----");
        for (var die : dice) {
            System.out.print(die.getNumberOnDie() + " ");
        }
        System.out.println("\n");
    }

    static public List<Integer> getUserChoices() {
        System.out.print("Enter dice to re-roll 1-5. (Ex: 1 2 3) --> ");
        String input = scanner.nextLine();
        // input error checking/range/no entry
        // input expectation x y z
        // split on the spaces
        String[] inputArray = input.split(" ");
        // create array of user input ints
        List<Integer> choices = new ArrayList<Integer>();
        for (String number : inputArray) {
            //loop and parse to the choices List
            choices.add(Integer.parseInt(number) - 1);
        }
        return choices; // <1, 2, 3>
    }
}
