package com.avacallery;

// hand contains 5 die values -> has a relationship, not is a

public class MyHand {
    private Die[] dice;

    // create hand with x number of dice
    public MyHand(int size) {
        // this creates the space for 5 dice to be assigned to
        // hand contains 5 die values
        for (int numberOfSides = 0; numberOfSides < size; numberOfSides++)
       dice = new Die[5];
    }

    public Die[] rollDice() {
        for (int i = 0; i < dice.length; i++) {
            Die die = new Die();
            dice[i] = die;
            dice[i].rollDie();
        }
        return dice;
    }
}
