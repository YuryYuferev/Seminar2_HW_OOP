package Impl;

import Seminar2_HW_OOP.Animal;
import Seminar2_HW_OOP.Swimmable;

public class Whale extends Animal implements Swimmable {
    public Whale(String name, String color) {
        super(name, color, 0);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 30;
    }
}
