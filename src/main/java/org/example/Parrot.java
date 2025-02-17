package org.example;

public class Parrot extends Animal implements Speakable{
  public Parrot(String name, Integer age){
      super(name, age);
  }

    @Override
    public void speak() {
        System.out.println("Squirk");
    }
}
