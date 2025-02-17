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

        AnimalInfoFormatter textFormater = new TextAnimalFormatter();
        AnimalInfoFormatter jsonFormater = new JsonAnimalFormatter();

        System.out.println(textFormater.formatInfo(cat));
        System.out.println(textFormater.formatInfo(dog));
        System.out.println(jsonFormater.formatInfo(parrot));
    }
}
