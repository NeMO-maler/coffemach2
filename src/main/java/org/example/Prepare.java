package org.example;

import java.util.Scanner;

class Prepare {



    public static void prepare(){
        System.out.println("_______________________");
        System.out.println("Меню приготовления");
        System.out.println("Выберите напиток:");
        System.out.println("1.Капучино");
        System.out.println("2.Еспрессо");
        System.out.println("Вернуться в предыдущее меню");
        System.out.println("______________________");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextByte();
        switch (ch){
            case 1:
                System.out.println("Вы выбрали капучино");
                MainMenu.water -= Capuchino.waterRashod;
                MainMenu.Coffe -= Capuchino.coffeeRashod;
                MainMenu.milk -= Capuchino.milkRashod;
                MainMenu.polution ++;
                System.out.println("Приготовлено капучино");
                prepare();
            case 2:
                System.out.println("--------------------------");
                System.out.println("Вы выбрали эспрессо");
                MainMenu.water -= expreso.waterRashod;
                MainMenu.Coffe -= expreso.coffeeRashod;
                MainMenu.milk -= expreso.milkRashod;
                MainMenu.polution ++;
                System.out.println("Приготовлено эспрессо");
                System.out.println("__________________________");
                prepare();

            case 3:
                MainMenu.main();
        }

    }
}
