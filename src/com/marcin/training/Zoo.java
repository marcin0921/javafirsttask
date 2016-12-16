package com.marcin.training;

import java.util.HashMap;
import java.util.Map;


class Zoo {

    private Map<String, String> animals = new HashMap<String, String>() {
        {
            put("Wąż", "Snake");
            put("Struś", "Ostrich");
            put("Małpa", "Monkey");
            put("Paw", "Peacock");
            put("Leming", "Lemming");
            put("Wielbłąd", "Camel");
            put("Słoń", "Elephant");
            put("Żyrafa", "Giraffe");
            put("Nosorożec", "Rhino");
            put("Lew", "Lion");
        }
    };


    void takeAnimal(String userAnimal) {

        String found = animals.get(userAnimal);

        if ( found == null ) {
            System.out.println("Niestety, nie mamy takiego zwierzaka w ZOO :-(");
        } else {
            System.out.println("Tak! Znaleziono " + userAnimal + ". Angielska nazwa: " + found);
        }
    }


}
