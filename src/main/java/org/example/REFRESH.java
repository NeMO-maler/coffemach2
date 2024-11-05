package org.example;

import java.util.Scanner;

public class REFRESH {
    public static void Refresh() {
        System.out.println("Выберите действие: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(".Выберите действие:");
        System.out.println("0.Восполнить запас воды");
        System.out.println("1.Восполнить запас воды");
        System.out.println("2.Восполнить запас молока");
        System.out.println("3.Восполнить запас кофе");
        System.out.println("4.Воспроизвести очистку");
        System.out.println("5.Воспроизвести очистку и пополнение всех ингридиентов");
        System.out.println("6.Вернуться назад");
        int rf = scanner.nextInt();
        switch (rf) {
            case 1:
                MainMenu.water = MainMenu.maxWater;
                Refresh();
            case 2:
                MainMenu.milk = MainMenu.maxMilk;
                Refresh();
            case 3:MainMenu.Coffe = MainMenu.maxCoffe;
                Refresh();
            case 4: MainMenu.polution = 0;
                    Refresh();
            case 6:
                MainMenu.main();
            case 5:
                MainMenu.water = MainMenu.maxWater;
                MainMenu.milk = MainMenu.maxMilk;
                MainMenu.Coffe = MainMenu.maxCoffe;
                MainMenu.polution = 0;
                Refresh();
            case 0:
                System.out.println("Текущее кол-во воды:" + MainMenu.water);
                System.out.println("Текущее кол-во кофе:" + MainMenu.Coffe);
                System.out.println("Текущее кол-во молока:" + MainMenu.milk);
                System.out.println("Состояние загрязнение:" + MainMenu.polution);
        }


    }
}