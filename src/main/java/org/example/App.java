package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal parrot = new Parrot();
        parrot.setAge(4);
        parrot.setName("Papuzhka");
        dog.setAge(9);
        dog.setName("Barsic");
        cat.setAge(12);
        cat.setName("Muska");


    }
}
