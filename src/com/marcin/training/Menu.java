package com.marcin.training;

import java.util.InputMismatchException;
import java.util.Scanner;
class Menu {

    int takeOption() {
        System.out.println("Wybierz pozycję z MENU: \n 1 - Przekaż zwierzę do ZOO \n 9 - Koniec programu");
        Scanner sc = new Scanner(System.in);
        int menuChoosed;


        try {
            menuChoosed = sc.nextInt();

        } catch (InputMismatchException e) {
            menuChoosed = 0;
        }

        return menuChoosed;

    }

    private boolean isInteger(String input)
    {
        try
        {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e )
        {
            return false;
        }
    }

    String getUserAnimal() {
        System.out.println("Podaj nazwę zwierzęcia, które chcesz odnaleźć.");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();

        animal = animal.substring(0, 1).toUpperCase() + animal.substring(1);

        if (isInteger(animal)) {
            do {
                System.out.println("Błąd! Podałęś liczbę zamiast nazwy zwięrzęcia \nSpróbuj ponownie: ");
                animal = sc.nextLine();
            } while(isInteger(animal));
        }
        return animal;
    }



}





