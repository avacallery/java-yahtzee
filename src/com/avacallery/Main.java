package com.avacallery;

import com.avacallery.Console;
import com.avacallery.Die;
import com.avacallery.MyHand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// create die class and give all the properties/methods it needs
// properties of die: randomizer? Number of sides?
// write method for hand to roll and reroll
// Hand constructor can call roll on all the dice
// dieValue or value for what the die lands on
// array or map dice? Hand has 5 dice. Array cannot be adjusted after creating.
// where would a hand class come in?

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        MyHand hand = new MyHand(5);

        Console.showDice(hand.getDice());

        hand.rollDice(random, new ArrayList<>(Arrays.asList(1, 3, 0)));

        Console.showDice(hand.getDice());

        hand.rollDice(random, new ArrayList<>(Arrays.asList(2, 4, 1)));

        Console.showDice(hand.getDice());

    }
}
