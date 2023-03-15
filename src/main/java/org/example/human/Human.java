package org.example.human;

import org.example.animal.Animal;


public abstract class Human extends Animal {
    private String surname;
    public Human(String name, String surname) {
        super(name, null, 2);
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Post: %s, Name: %s, Surname: %s", super.getType(), super.getName(), this.surname);
    }
    @Override
    public void huntMode() {

    }

    @Override
    public boolean getIll() {
    super.isSick();
        return false;
    }

    public abstract boolean employment();
}
