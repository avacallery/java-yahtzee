package com.avacallery;

import java.util.Random;

// hand contains 5 die values -> has a relationship, not is a

public class MyHand {
    public DieValue[] dice;
    Random value = new Random();

    // create hand with x number of dice
    public MyHand() {
        // this creates the space for 5 dice to be assigned to
        // hand contains 5 die values
       dice = new DieValue[5];
    }

    public DieValue[] rollDice() {
        for (int i = 0; i < dice.length; i++) {
            DieValue die = new DieValue();
            dice[i] = die;
            dice[i].rollDie();
        }
        return dice;
    }
}
