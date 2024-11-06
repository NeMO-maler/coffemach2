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
        Scanner scan = new Scanner(System.in);
        System.out.println("ГЛАВНОЕ МЕНЮ");

        byte van = -1;
            while (van < 0 || van > 4) {
            System.out.println("________________________________");
            System.out.println("1.Приготовить кофе");
            System.out.println("2.Показатели ингридиентов и ззагрязнения");
            System.out.println("3.Выключить кофемашниу");
            System.out.println("4.Посмотреть логи");
            System.out.println("________________________________");

            try {
                String input = scan.nextLine();
                van =Byte.parseByte(input);
                if (van < 0 || van > 4){
                    System.out.println("Ошибка ввода. Введите значение от 1 до последнего(4)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное значение");
            }

            switch (van){
                case 1: if (Coffe < 4){
                    System.out.println("______________________________________________");
                    System.out.println("Недостаточно кофейных зерен. Пополните запас.");
                    System.out.println("----------------------------------------------");
                    REFRESH.Refresh();
            };
                if (milk< 200){
                    System.out.println("______________________________________________");
                    System.out.println("Недостаточно молока. Пополните запас.");
                    System.out.println("----------------------------------------------");
                    REFRESH.Refresh();
                };
                if(water < 140) {
                    System.out.println("______________________________________________");
                    System.out.println("Недостаточно воды. Пополните запас.");
                    System.out.println("----------------------------------------------");
                    REFRESH.Refresh();
                };
                if (polution >= 10){
                    System.out.println("______________________________________________");
                    System.out.println("Кофемашина загрязнена. Необходима очистка");
                    System.out.println("----------------------------------------------");
                    REFRESH.Refresh();
                } else {
                    Logi.log("Приготовление напитка");
                    Prepare.prepare();
                }

            case 2:
                REFRESH.Refresh();
                break;
            case 3:
                Logi.log("Машина выключена");
                System.out.println("Выключение кофемашины");
                System.exit(0);
        }
        }
    }
    }









