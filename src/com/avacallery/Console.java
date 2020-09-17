package com.avacallery;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    // get die that user wants to reroll

    public static String startGame(String prompt) {
        return scanner.next();
    }
}
