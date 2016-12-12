package com.marcin.training;

import java.util.Arrays;
import java.util.List;


class Zoo {


    private final static List<String> animals2 = Arrays.asList("lemming", "ostrich", "monkey", "peacock",
            "snake", "camel", "elephant", "giraffe", "rhino", "lion");


    void takeAnimal(String animalKey) {


        if ( animals2.contains(animalKey) ) {
            System.out.println("Tak! Znaleziono " + animalKey + ". Zapraszamy do odwiedzin ZOO.");

        } else {
            System.out.println("Niestety, nie mamy takiego zwierzaka w ZOO :-(");

        }
    }



}
