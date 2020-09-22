package com.avacallery;

import java.util.Scanner;

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



    // user types "START", returns array of dice
    // prompt: "Roll 2: Which die would you like to re-roll?"
    // user types either 1, 2, 3, 4, 5 or ALL (?)
    // prompt: "Roll 3: Which die would you like to re-roll?"
    // user types either 1, 2, 3, 4, 5 or ALL (?)
    // returns final roll of dice


//    public static String startGame(String prompt) {
//
//    }
}
