package org.example;

import java.util.Scanner;

class Prepare {



    public static void prepare(){
        Scanner scan = new Scanner(System.in);
        byte coff = -1;
        byte kr = -1;
        while ( coff < 1 || coff > 2){
        System.out.println("_______________________");
        System.out.println("Меню приготовления");
        System.out.println("Выберите напиток:");
        System.out.println("1.Капучино");
        System.out.println("2.Еспрессо");
        System.out.println("Вернуться в предыдущее меню");
        System.out.println("______________________");

        try {
            String input = scan.nextLine();
            coff =Byte.parseByte(input);

            if ( coff < 1 || coff > 2){
                System.out.println("___________________________");
                System.out.println("Выберите значение 1 или 2");
                System.out.println("___________________________");
            }
        } catch (NumberFormatException e) {
            System.out.println( "Введите корректное значение указаное выше ");
        }
        }
        while (kr < 0 || kr > 5) {
            System.out.println("Выберите кол-ва кружек (максимум 5)");
                try {
                    String input = scan.nextLine();
                    kr =Byte.parseByte(input);
                    if (kr < 0 || kr > 5){
                        System.out.println("____________________________");
                        System.out.println("Выберите значение от 1 до 5");
                        System.out.println("____________________________");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введите корректное значение указаное выше");
                }
        }

        switch (coff){
            case 1:
                System.out.println("Вы выбрали капучино");
                MainMenu.water -= Capuchino.waterRashod * kr;
                MainMenu.Coffe -= Capuchino.coffeeRashod * kr;
                MainMenu.milk -= Capuchino.milkRashod * kr;
                MainMenu.polution ++;
                System.out.println("Приготовлено капучино");
                MainMenu.main();
            case 2:
                System.out.println("--------------------------");
                System.out.println("Вы выбрали эспрессо");
                MainMenu.water -= expreso.waterRashod * kr;
                MainMenu.Coffe -= expreso.coffeeRashod * kr;
                MainMenu.milk -= expreso.milkRashod * kr;
                MainMenu.polution ++;
                System.out.println("Приготовлено эспрессо");
                System.out.println("__________________________");
                MainMenu.main();


        }

    }
}
