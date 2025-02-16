package org.example;

public class Dog extends Animal{


    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
