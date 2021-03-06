package com.marcin.training;

class InitMenu extends Menu {

    private Menu menu = new Menu();

    void initMenu() {
        int option;

        do {
            option = menu.takeOption();
            switch(option) {
                case 1:
                    System.out.println("Wybrano opcję 1");
                    Zoo zoo = new Zoo();
                    String userAnimal = getUserAnimal();
                    zoo.takeAnimal(userAnimal);
                    break;
                case 9:
                    System.out.println("Program kończy pracę");
                    break;
                default:
                    System.out.println("Wybierz właściwą opcję");
                    break;
            }
        } while (option != 9);


    }
}
