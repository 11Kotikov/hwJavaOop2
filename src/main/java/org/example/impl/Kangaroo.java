package org.example.impl;

import org.example.animal.Animal;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;

public class Kangaroo extends Animal implements Runnable, Speakable {
    public Kangaroo(String name, String colour, int legsCount) {
        super(name, colour, legsCount);
    }
    public Kangaroo (String name){
        this(name, "brown", 2);
    }


    @Override
    public void speakMode() {
        System.out.printf("%s %s says grunts \n", getType(), getName());
    }

    @Override
    public void huntMode() {

    }

    @Override
    public boolean getIll() {

        return false;
    }

    @Override
    public int getRunSpeed() {
        return 50;
    }
}
