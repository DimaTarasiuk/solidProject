package org.example;

public class AnimalPrineter {
    public static void printInfo(Animal animal){
        System.out.println("I am a " + animal.getClass().getSimpleName());
        System.out.println("My name is "+ animal.getName());

        if (animal instanceof Speakable){
            ((Speakable) animal).speak();
        }
        System.out.println("-------------------");
    }
}
