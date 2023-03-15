package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Swimable;

public class Shark extends Animal implements Swimable {
    public Shark(String name, String colour) {
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
    public int getSwimSpeed() {
        return 50;
    }
}
