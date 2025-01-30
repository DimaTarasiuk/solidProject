package org.example;

public class Animal {
    private String name;
    private Integer age;

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
        System.out.println("no sound");
    }
}
