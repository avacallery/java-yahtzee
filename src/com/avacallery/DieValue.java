package com.avacallery;

import java.util.Random;

public class DieValue {
    // have field that represents what number die it is
    public int numberOnDie;

    public int rollDie() {
        Random value = new Random();
        numberOnDie = value.nextInt(6) + 1;
        return numberOnDie;
    }
}
