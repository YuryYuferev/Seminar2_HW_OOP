package Impl;

import Seminar2_HW_OOP.Animal;
import Seminar2_HW_OOP.Swimmable;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, String color) {
        super(name, color,0);
    }

    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Weeeeu!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getSwimmingSpeed() {
        return 45;
    }
}
