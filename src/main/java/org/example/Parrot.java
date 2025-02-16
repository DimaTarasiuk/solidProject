package org.example;

public class Parrot extends Animal{
  public Parrot(String name, Integer age){
      super(name, age);
  }

    @Override
    public void speak() {
        System.out.println("Squawk");
    }
}
