package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Flyable;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;

public class Eagle extends Animal implements Flyable, Runnable, Speakable {
    public Eagle(String name, String colour, int legsCount) {
        super(name, colour, 2);
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says yeeeeeaaaaaah \n", getType(), getName());
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
        return 100;
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }
}
