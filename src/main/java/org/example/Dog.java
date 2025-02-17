package org.example;

public class Dog extends Animal implements Speakable{


    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
