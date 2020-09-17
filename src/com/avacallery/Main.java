package com.avacallery;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// create die class and give all the properties/methods it needs
// properties of die: randomizer? Number of sides?
// write method for hand to roll and reroll
// Hand constructor can call roll on all the dice
// dieValue or value for what the die lands on
// array or map dice? Hand has 5 dice. Array cannot be adjusted after creating.
// where would a hand class come in?

public class Main {

    public static void main(String[] args) {
        // create method that accepts hand and prints values

        MyHand roll1 = new MyHand();
        DieValue[] myHand = roll1.rollDice();
        for ( int i = 0; i < myHand.length; i++)
        System.out.print(myHand[i].numberOnDie + " ");

        // reroll first die
        myHand[0].rollDie();

        System.out.println();


        for ( int i = 0; i < myHand.length; i++)
            System.out.print(myHand[i].numberOnDie + " ");
    }
}
