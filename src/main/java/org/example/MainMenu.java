package org.example;

import java.util.Scanner;

public class MainMenu {
    public static int Coffe = 1000;
    public static int maxCoffe = 1000;
    public static int water = 2000;
    public static int maxWater = 2000;
    public static int milk = 1000;
    public static int maxMilk = 1000;
    public static int polution = 0;
    public static int maxPolutiom = 20;

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ГЛАВНОЕ МЕНЮ");

        byte van = -1;
            while (van < 0 || van > 6) {
            System.out.println("________________________________");
            System.out.println("1.Приготовить кофе(готовый щаблон)");
            System.out.println("2.создать свой вариант");
            System.out.println("3.Приготовить свой вариант");
            System.out.println("4.Показатели ингридиентов и загрязнения");
            System.out.println("5.логи");
            System.out.println("6 Выключить кофемашниу");
            System.out.println("________________________________");

            try {
                String input = scan.nextLine();
                van =Byte.parseByte(input);
                if (van < 0 || van > 6){
                    System.out.println("Ошибка ввода. Введите значение от 1 до 6");
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
                Logi.log("Создание профиля");
                menu4.nam4();
                break;
            case 3:
                Logi.log("Выбо профиля");
               menu5.nam5();
               break;
            case 4:
                Logi.log("Выбор просмотра ингридиентов");
                REFRESH.Refresh();
                break;
            case 5:
                Logi.log("Просмотр логов");
                msg.msg();
                break;
            case 6:
                Logi.log("Машина выключена");
                System.out.println("Выключение кофемашины");
                System.exit(0);
            }
        }
    }
    }









