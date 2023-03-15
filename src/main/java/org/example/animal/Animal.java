package org.example.animal;
import lombok.Getter;
import lombok.Setter;

@Getter

public abstract class Animal {
    private String name;
    private String colour;
    private int legsCount;
    @Setter
    private boolean isSick;


    private static int animalCount = 0;

    public Animal(String name, String colour, int legsCount) {
        this.name = name;
        this.colour = colour;
        this.legsCount = legsCount;
        animalCount++;
    }

    public Animal(String name, String colour) {
        this(name, colour, 0);
    }

    public Animal(String name) {
        this(name, "transparent", 0);
    }

    public Animal() {
        this("Undefined");
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public abstract void huntMode();
    public abstract boolean getIll();
    @Override
    public String toString() {
        return String.format("Animal %s, Name: %s, Colour: %s", this.getType(), this.name, this.colour);
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

