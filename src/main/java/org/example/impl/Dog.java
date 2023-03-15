package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;
import org.example.interfaces.Swimable;

public class Dog extends Animal implements Runnable, Swimable, Speakable {

    public Dog(String name, String colour, int legsCount) {
        super(name, colour, legsCount);
    }

    public Dog(String name, String colour) {
        this(name, colour, 4);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says bark \n", getType(), getName());
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
    public int getRunSpeed() {
        return 30;
    }

    @Override
    public int getSwimSpeed() {
        return 4;
    }
}
