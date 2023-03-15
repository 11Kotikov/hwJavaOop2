package org.example;

import org.example.animal.Animal;
import org.example.human.Human;
import org.example.impl.*;
import org.example.interfaces.Flyable;
import org.example.interfaces.Runnable;
import org.example.interfaces.Swimable;
import org.example.veterinary.VetClinic;


public class Main {
    public static void main(String[] args) {

        VetClinic vetClinicWorkers = new VetClinic();
        vetClinicWorkers
                .addHuman(new Doctor("Ivan", "Pavlov"));

        VetClinic vetClinicClients = new VetClinic();
        vetClinicClients
                .addAnimal(new Cat("Brat", "white"))
                .addAnimal(new Dog("Milo"))
                .addAnimal(new Duck("Gerda", "grey"))
                .addAnimal(new Eagle("Rush", "black", 2))
                .addAnimal(new Kangaroo("Ru"))
                .addAnimal(new Shark("Toothy", "black"))
                .addAnimal(new Sparrow("Jack", "grey", 2))
                .addAnimal(new Triton("Slethy", "red", 2))
                .addAnimal(new Walrus("Fangy", "brown"));
        System.out.println("Animals on sight: ");
        for (Animal animals : vetClinicClients.getAnimals()) {
            System.out.println(animals);
        }
        System.out.println("Who is able to fly:");
        for (Flyable fly : vetClinicClients.getFlyableAnimals()) {
            System.out.println(fly + " (max speed is " + fly.getFlySpeed() + ")");
        }
        System.out.println("Who is able to run:");
        for (Runnable run : vetClinicClients.getRunnableAnimals()) {
            System.out.println(run + " (max speed is " + run.getRunSpeed() + ")");
        }
        System.out.println("Who is able to swim:");
        for (Swimable swim : vetClinicClients.getSwimableAnimals()) {
            System.out.println(swim + " (max speed is " + swim.getSwimSpeed() + ")");
        }

        System.out.println("Our workers:");
        for (Human humans : vetClinicWorkers.getHumans()) {
            System.out.println(humans);
        }
        System.out.println("Who is sick now:");
        for (Animal animal : vetClinicClients.getSickAnimals()) {
            System.out.println(animal.getName() + " is sick.");
        }

    }
}