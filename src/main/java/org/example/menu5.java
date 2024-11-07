package org.example;

import java.util.Scanner;

public class menu5 {
    public static void nam5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название профиля: ");
        String name = scan.nextLine().trim();
        profile profile = menu4.getProfiles().get(name);
        if (profile != null) {
            MainMenu.milk += profile.milk;
            MainMenu.Coffe += profile.coffee;
            MainMenu.water += profile.water;
            MainMenu.polution++;

            System.out.println("-------------------------------------------");
            System.out.println("Ваш " + name + " готов.");
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("Профиль с именем " + name + " не найден.");
            System.out.println("Создайте новый профиль!");
            System.out.println("-------------------------------------------");
        }
        MainMenu.main();
    }
}
