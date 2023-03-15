package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;
import org.example.interfaces.Swimable;

public class Walrus extends Animal implements Runnable, Swimable, Speakable {
    @Override
    public void speakMode() {
        System.out.printf("%s %s says baaarkl \n", getType(), getName());
    }

    public Walrus(String name, String colour) {
        super(name, colour);
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
        return 2;
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
