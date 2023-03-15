package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Flyable;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;
import org.example.interfaces.Swimable;

public class Duck extends Animal implements Flyable, Runnable, Swimable, Speakable {
    public Duck(String name, String colour) {
        super(name, colour, 2);
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says quack \n", getType(), getName());
    }

    @Override
    public void huntMode() {

    }

    @Override
    public boolean getIll() {

        return true;
    }

    @Override
    public int getFlySpeed() {
        return 60;
    }

    @Override
    public int getRunSpeed() {
        return 4;
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }

    public static class Doctor {
    }
}
