package org.example;

import java.util.Scanner;

public class MainMenu {
    public static int nowCoffe;
    public static int maxCoffe = 1000;
    public static int water;
    public static int maxWater = 4000;
    public static int milk;
    public static int maxMilk = 3000;

    public static void main() {
        System.out.println("________________________________");
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1.Приготовить кофе");
        System.out.println("2.Запас ингридиентов");
        System.out.println("3.Посмотреть историю действий");
        System.out.println("4.Выключить кофемашниу");
        System.out.println("________________________________");
        Scanner scanner = new Scanner(System.in);
        byte choise = scanner.nextByte();
        switch (choise){
            case 1: Prepare.prepare();
        }
    }



}
