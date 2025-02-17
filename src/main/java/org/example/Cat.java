package org.example;

public class Cat extends Animal implements Speakable{
    public Cat(String name, Integer age){
        super(name,age);
    }
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
