package com.avacallery;

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
        System.out.println("First roll: ");
        for ( int i = 0; i < myHand.length; i++)
            System.out.print(myHand[i].numberOnDie + " ");

        System.out.println();
        System.out.println("Second roll (re-roll 1st die): ");
        myHand[0].rollDie();
        for ( int i = 0; i < myHand.length; i++)
            System.out.print(myHand[i].numberOnDie + " ");

        System.out.println();
        System.out.println("Third roll (re-roll 3rd die): ");
        myHand[2].rollDie();
        for ( int i = 0; i < myHand.length; i++)
            System.out.print(myHand[i].numberOnDie + " ");
    }
}
