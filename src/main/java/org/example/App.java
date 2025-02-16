package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal cat = new Cat("Miska", 2);
        Animal dog = new Dog("Rex",3);
        Animal parrot = new Parrot("Parrot", 12);

        cat.printInfo();
        dog.printInfo();
        parrot.printInfo();
    }
}
