package org.example;
import com.google.gson.Gson;

public class JsonAnimalFormatter implements AnimalInfoFormatter{
    private final Gson gson = new Gson();
    @Override
    public String formatInfo(Animal animal) {
        return gson.toJson(animal);
    }
}
