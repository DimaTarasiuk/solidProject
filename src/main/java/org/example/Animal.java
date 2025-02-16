package org.example;

public class Animal {
    private String name;
    private Integer age;

    public Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void speak(){
    }
    public void printInfo(){
        System.out.println("I am a " + this.getClass().getSimpleName());
        System.out.println("my name is " + getName()+" and I am " + getAge() + " years old.");
        speak();
        System.out.println("------------------------");
    }
}
