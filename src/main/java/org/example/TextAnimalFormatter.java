package org.example;

public class TextAnimalFormatter implements AnimalInfoFormatter{
    @Override
    public String formatInfo(Animal animal) {
        StringBuilder info = new StringBuilder();
        info.append("I am a ").append(animal.getClass().getSimpleName()).append("\n");
        info.append("is ").append(animal.getName()).append("and I am ").
                append(animal.getAge()).append(" years old.\n");

        return info.toString();
    }
}
