package Impl;

import Seminar2_HW_OOP.Animal;
import Seminar2_HW_OOP.Runnable;

public class Cow extends Animal implements Runnable {
    public Cow(String name, String color) {
        super(name, color,4);
    }

    public Cow(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Mooo!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getRunningSpeed() {
        return 15;
    }
}
