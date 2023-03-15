package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Flyable;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;

public class Sparrow extends Animal implements Flyable, Runnable, Speakable {
    public Sparrow(String name, String colour, int legsCount) {
        super(name, colour, legsCount);
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says tweet \n", getType(), getName());
    }

    @Override
    public void huntMode() {

    }

    @Override
    public boolean getIll() {

        return false;
    }

    @Override
    public int getFlySpeed() {
        return 30;
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }
}
