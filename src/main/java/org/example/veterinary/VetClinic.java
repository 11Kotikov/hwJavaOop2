package org.example.veterinary;

import lombok.Getter;
import org.example.animal.Animal;
import org.example.human.Human;
import org.example.interfaces.Flyable;
import org.example.interfaces.Runnable;
import org.example.interfaces.Speakable;
import org.example.interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    @Getter
    private List<Animal> animals;
    @Getter
    private List<Human> humans;

    public VetClinic() {
        this.animals = new ArrayList<>();
        this.humans = new ArrayList<>();
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public VetClinic addHuman(Human human) {
        this.humans.add(human);
        return this;
    }

    public List<Flyable> getFlyableAnimals() {
        List<Flyable> flyableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) flyableAnimals.add((Flyable) animal);
        }
        return flyableAnimals;
    }

    public List<Runnable> getRunnableAnimals() {
        List<Runnable> runnableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) runnableAnimals.add((Runnable) animal);
        }
        return runnableAnimals;
    }

    public List<Speakable> getSpeakableAnimals() {
        List<Speakable> speakableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Speakable) speakableAnimals.add((Speakable) animal);
        }
        return speakableAnimals;
    }

    public List<Swimable> getSwimableAnimals() {
        List<Swimable> swimableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) swimableAnimals.add((Swimable) animal);
        }
        return swimableAnimals;
    }

    public List<Animal> getSickAnimals() {
        List<Animal> sickAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getIll()) {
                sickAnimals.add(animal);
            }
        }
        return sickAnimals;
    }

    //    public List<String> getIllAnimals(){
//        List<String> illAnimals = new ArrayList<>();
//        for (Animal animal: animals) {
//
//        }
//    }
}
