package Impl;

import Seminar2_HW_OOP.Animal;
import Seminar2_HW_OOP.Runnable;

public class Rabbit extends Animal implements Runnable {
    public Rabbit(String name, String color) {
        super(name, color,4);
    }

    public Rabbit(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wiiiii!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getRunningSpeed() {
        return 45;
    }
}
