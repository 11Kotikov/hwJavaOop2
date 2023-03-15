package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Runnable;
import org.example.interfaces.Swimable;

public class Triton extends Animal implements Runnable, Swimable {
    public Triton(String name, String colour, int legsCount) {
        super(name, colour, legsCount);
    }

    @Override
    public void huntMode() {

    }

    @Override
    public boolean getIll() {

        return true;
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
}
