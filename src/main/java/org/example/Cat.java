package org.example;

public class Cat extends Animal{
    private String name;
    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
