package Impl;

import Seminar2_HW_OOP.Human;

public class Doctor extends Human {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("I'm curing all animals...");
    }
}
