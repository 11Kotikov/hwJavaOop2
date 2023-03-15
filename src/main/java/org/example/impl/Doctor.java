package org.example.impl;

import org.example.human.Human;
import org.example.interfaces.Speakable;

public class Doctor extends Human implements Speakable {
    public Doctor(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void speakMode() {
        System.out.printf("%s %s says I'm working here \n", super.getType(), super. getName());
    }

    @Override
    public void huntMode() {

    }

    @Override
    public boolean employment() {

        return true;
    }

    public void toHeal (){
        System.out.printf("%s %s now is healing", super.getType(), super.getName());
    }

}
