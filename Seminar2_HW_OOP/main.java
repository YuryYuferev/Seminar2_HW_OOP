package Seminar2_HW_OOP;

import Impl.*;
import Veterinary.VetClinic;

class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Leopold"))
                .addAnimal(new Dog("Bobby"))
                .addAnimal(new Duck("Donald"))
                .addAnimal(new Eagle("Harry"))
                .addAnimal(new Cow("Bonja"))
                .addAnimal(new Rabbit("Stepashka"))
                .addAnimal(new Dolphin("Flipper"))
                .addAnimal(new Whale("Мobi Dick"))
                .addAnimal(new Doctor("Aibolit"));

        System.out.println("All animals:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunningSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimmingSpeed());
        }


        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlightSpeed());
        }

        System.out.println("\nSpeaking animals:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nI am the chief doctor of the medical center for animals:");
        System.out.println(vetClinic.getChiefDoctor());
        vetClinic.getChiefDoctor().speak();
        vetClinic.getChiefDoctor().work();
    }
}
