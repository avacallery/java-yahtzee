package com.avacallery;

// hand contains 5 die values -> has a relationship, not is a
// CREATE 5 DICE

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyHand {
    private List<Die> dice = new ArrayList<Die>();

    // create hand with x number of dice
    public MyHand(int size) {
        // this creates the space for 5 dice to be assigned to
        // hand contains 5 die values
        for (int numberOfSides = 0; numberOfSides < size; numberOfSides++)
       dice.add(new Die());
    }

    public void rollDice(Random random) {
       for (var die : dice) {
           die.dieValue(random);
       }
    }

    public void rollDice(Random random, int specificDie) {
        dice.get(specificDie).dieValue(random);
    }

    public void rollDice(Random random, List<Integer> dieChoices) {
        for (int choice : dieChoices) {
            rollDice(random, choice);
        }

    }

    public List<Die> getDice() {
        return dice;
    }
}
