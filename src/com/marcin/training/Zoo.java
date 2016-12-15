package com.marcin.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Zoo {


    private final static List<String> animals2 = Arrays.asList("lemming", "ostrich", "monkey", "peacock",
            "snake", "camel", "elephant", "giraffe", "rhino", "lion");

    Map<String, String> animals = new HashMap<String, String>();

    String test = animals.put("wąż", "snake");
    String test2 = animals.put("struś", "ostrich");

    public Map<String, String> getAnimals() {
        return animals;
    }

    void takeAnimal(String animalKey) {


        if ( animals2.contains(animalKey) ) {
            System.out.println("Tak! Znaleziono " + animalKey + ". Zapraszamy do odwiedzin ZOO.");

        } else {
            System.out.println("Niestety, nie mamy takiego zwierzaka w ZOO :-(");

        }
    }



}
