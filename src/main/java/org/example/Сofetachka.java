package org.example;

import java.util.Scanner;

class Cofetachka {
    public static int nowCoffe;
    public static int maxCoffe = 150;
    public static int nowMilk;
    public static int maxMilk = 2500;
    public static int nowWater;
    public static int maxWater = 3000;
    public static int nowPollution;
    public static int maxPollution = 150;

    public static void cofetachka() {
        Scanner scanner = new Scanner(System.in);
        byte men = -1;
            while (men > 0 || men < 6) {
                System.out.println("_____ОТКРЫТО ГЛАВНОЕ МЕНЮ______");
                System.out.println("-------------------------------");
                System.out.println("1.Приготовить кофе");
                System.out.println("2.Проверить кол-во ингридиентов");
                System.out.println("3.Пополнить кол-во ингридиентов");
                System.out.println("4.Проверить степень загрязнения");
                System.out.println("5.История дейсвий");
                System.out.println("6.?");
                System.out.println("0.Выключить");
                System.out.println("-------------------------------");

            }

    }
}
    /*public static void rascapuchino() {
        System.out.println("Состав капучино");
        System.out.println("вода:" + Capuchino.waterRashod);
        System.out.println("молоко:" + Capuchino.milkRashod);
        System.out.println("Зерно:" + Capuchino.coffeeRashod);
    }
    public static void rasespersso(){
        System.out.println("Состав эспрессо");
        System.out.println("вода:" + expreso.waterRashod);
        System.out.println("молоко:" + expreso.milkRashod);
        System.out.println("Зерно:" + expreso.coffeeRashod);
    }*/