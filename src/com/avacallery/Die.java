package com.avacallery;

import java.util.Random;

public class Die {
    // have field that represents what number die it is
    private int numberOnDie;
    private int sides;

    public Die(int sides) {
        this.sides = sides;
        this.numberOnDie = 1;
    }


    public void dieValue(Random random) {
        numberOnDie = random.nextInt(sides) + 1;
    }

    public int getNumberOnDie() {
        return numberOnDie;
    }
}
