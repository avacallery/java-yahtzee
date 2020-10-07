package com.avacallery;

import java.util.Random;

public class Yahtzee {
    public void playYahtzee() {
        Random random = new Random();

        MyHand hand = new MyHand(5);
        hand.rollDice(random);

        Console.showDice(hand.getDice());

        hand.rollDice(random, Console.getUserChoices());

        Console.showDice(hand.getDice());

        hand.rollDice(random, Console.getUserChoices());

        Console.showDice(hand.getDice());
        }
    }
