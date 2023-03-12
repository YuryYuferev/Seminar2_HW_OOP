package Veterinary;

import Impl.*;
import Seminar2_HW_OOP.*;
import Seminar2_HW_OOP.Runnable;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    private Human ChiefDoctor;

    public VetClinic(Human ChiefDoctor) {
        this.ChiefDoctor = ChiefDoctor;
        this.animals = new ArrayList<>();
    }

    public VetClinic() {
        this(null);
    }

    public List<Animal> getAllAnimals() {
        return this.animals;
    }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Speakable> getSpeakingAnimals() {
        List<Speakable> speakingAnimals = new ArrayList<>();

        for (Animal a : this.animals)
            if (a instanceof Speakable) speakingAnimals.add((Speakable) a);

        return speakingAnimals;
    }

    public Human getChiefDoctor() {
        return ChiefDoctor;
    }

    public VetClinic addAnimal(Animal animal) {
        if (animal instanceof Human)
            this.ChiefDoctor = (Human) animal;
        else
            this.animals.add(animal);
        return this;
    }
}
