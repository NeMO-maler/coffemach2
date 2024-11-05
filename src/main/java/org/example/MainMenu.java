package org.example;

import java.util.Scanner;

public class MainMenu {
    public static int Coffe = 1000;
    public static int maxCoffe = 1000;
    public static int water = 4000;
    public static int maxWater = 4000;
    public static int milk = 3000;
    public static int maxMilk = 3000;
    public static int polution = 0;
    public static int maxPolutiom = 20;

    public static void main() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        byte van = -1;
        while (van < 0 || van > 4) {
        System.out.println("________________________________");
        System.out.println("1.Приготовить кофе");
        System.out.println("2.Показатели ингридиентов и ззагрязнения");
        System.out.println("3.Выключить кофемашниу");
        System.out.println("Посмотреть логи");
        System.out.println("________________________________");
        Scanner scanner = new Scanner(System.in);

            try {
                String input = scanner.nextLine();

                if (van < 0 || van > 3) {
                    Logi.log("Ошибка ввода.");
                    System.out.println("Введите значение от 0 до 6.");
                }
            } catch (NumberFormatException e) {
                Logi.log("Ошибка ввода.");
                System.out.println("Введите корректное значение от 0 до 6.");
            }

        switch (van){
            case 1: Prepare.prepare();
                    main();
            case 2:
                REFRESH.Refresh();
            case 3:
                Logi.log("Машина выключена");
                System.out.println("Выключение кофемашины");
                System.exit(0);
        }}
    }

    }








