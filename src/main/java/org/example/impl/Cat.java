package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;

public class Cat extends Animal implements Runnable, Speakable {
    private boolean isFriendly;
    public Cat(String name, String colour, int legsCount, boolean isFriendly) {
        super(name, colour, legsCount);
        this.isFriendly = isFriendly;
    }

    public Cat(String name, String colour) {
        this(name, colour, 4, false);

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says _ \n", getType(), getName());
    }

    @Override
    public void huntMode() {
        System.out.printf("%s %s is hunting now", getType(), getName());
    }

    @Override
    public boolean getIll() {
        return true;
    }

    @Override
    public void setSick(boolean isSick) {
        super.setSick(isSick);
        if (!isFriendly){
            System.out.printf("%s %s is sick: ", getType(), getName());
        }
    }
}
