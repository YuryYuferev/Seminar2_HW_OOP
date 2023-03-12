package Impl;

import Seminar2_HW_OOP.Animal;
import Seminar2_HW_OOP.Flyable;
import Seminar2_HW_OOP.Runnable;
import Seminar2_HW_OOP.Swimmable;

public class Duck extends Animal implements Flyable, Runnable, Swimmable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }
}
